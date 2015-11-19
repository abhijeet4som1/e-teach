package com.iteach.services;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.iteach.Forms.LoginForm;
import com.iteach.Forms.RegisterForm;
import com.iteach.dao.EmailsDao;
import com.iteach.dao.UsersDao;
import com.iteach.entity.Emails;
import com.iteach.entity.Users;
import com.iteach.exception.ExceptionType;
import com.iteach.exception.ITeachException;
import com.iteach.utility.ITeachUtility;

/**
 * Login service class.
 * 
 * @author Abhijeet
 *
 */
@Service
public class LoginService {

	@Inject
	private UsersDao<Users> usersDao;

	@Inject
	private EmailsDao<Emails> emailsDao;

	/**
	 * login for the user.
	 * 
	 * @param loginForm
	 * @return
	 * @throws ITeachException
	 */
	public LoginForm login(LoginForm loginForm) throws ITeachException {
		List<Users> users = usersDao.getUserByUserName(loginForm.getUserName());
		if (!ITeachUtility.isEmptyList(users)) {
			if (users.size() > 1) {
				throw new ITeachException("more than one user with the same user name.", ExceptionType.DATA_EXCEPTION);
			} else {
				Users user = users.get(0);
				if (user.getPassword().equals(loginForm.getPassword())) {
					if (Character.valueOf('Y').equals(user.getAccountActivated())
							&& Character.valueOf('Y').equals(user.getEmailActivated())) {
						loginForm.setUserType(user.getUserType());
					} else {
						loginForm.addErrorMessage("userName", "This account is not activated yet.");
					}
				} else {
					loginForm.addErrorMessage("userName", "Invalid user name/password.");
					loginForm.addErrorMessage("password", "");
				}
			}
		} else {
			loginForm.addErrorMessage("userName", "Invalid user name/password.");
			loginForm.addErrorMessage("password", "");
		}
		return loginForm;
	}

	/**
	 * Service method to register new user.
	 * 
	 * @param registerForm
	 */
	public void registerNewUser(RegisterForm registerForm) throws ITeachException {
		Users user = new Users();
		// adding the user name.
		user.setUserName(registerForm.getUserName());
		// adding the email id.
		user.setEmailId(registerForm.getEmailAddress());
		// adding the password
		user.setPassword(registerForm.getPassword());
		// setting password salt
		user.setPasswordSalt("PASS_SALT");
		// setting email activated to no
		user.setEmailActivated('N');
		// setting the account activated to no
		user.setAccountActivated('N');
		// setting the user type
		user.setUserType(registerForm.getUserType());
		// setting the user activation key
		user.setActivationKey(getActivationKey());
		// inserting the new user in the DB.
		usersDao.insertNewUser(user);
		sendVerificationMail(user);
	}

	/**
	 * Sending the verification mail
	 * 
	 * @param user
	 * @throws ITeachException
	 */
	private void sendVerificationMail(Users user) throws ITeachException {
		Emails email = new Emails();
		email.setEmailTo(user.getEmailId());
		email.setEmailFrom(ITeachUtility.getPropValue("baseEmailId", true));
		email.setEmailFromName(ITeachUtility.getPropValue("iteach.email.name", false));
		email.setEmailSub(ITeachUtility.getPropValue("verification.mail.subject", false));
		email.setEmailBody(ITeachUtility.getPropValue("verification.mail.content", false).replace("ACTIVATION_KEY",
				user.getActivationKey()));
		email.setEmailAttachments(null);
		email.setCreatedOn(Calendar.getInstance().getTime());
		email.setCreatedBy("admin");
		email.setSendAttempt(0);
		email.setEmailStatus('N');
		emailsDao.saveEntity(email);
	}

	/**
	 * getting the unique activation key.
	 * 
	 * @return
	 * @throws ITeachException
	 */
	private String getActivationKey() throws ITeachException {
		String uuid = null;
		boolean isUnique = false;
		while (!isUnique) {
			uuid = UUID.randomUUID().toString();
			Users user = usersDao.findByActivationKey(uuid);
			if (user == null) {
				isUnique = true;
			}
		}
		return uuid;
	}

	/**
	 * validating the register form
	 * 
	 * @param registerForm
	 * @throws ITeachException
	 */
	public RegisterForm validateRegisterForm(RegisterForm registerForm) throws ITeachException {
		if (!isUserNameAvailable(registerForm.getUserName())) {
			registerForm.addErrorMessage("userName", "This user name is already used.");
		}
		if (!isEmailIdAvailable(registerForm.getEmailAddress())) {
			registerForm.addErrorMessage("emailAddress", "This Email Address is already used.");
		}
		return registerForm;
	}

	/**
	 * To check whether the user name is already in use.
	 * 
	 * @param userName
	 * @return
	 * @throws ITeachException
	 */
	public boolean isUserNameAvailable(String userName) throws ITeachException {
		boolean userAvail = true;
		List<Users> usersByUserName = usersDao.getUserByUserName(userName);
		if (!ITeachUtility.isEmptyList(usersByUserName)) {
			userAvail = false;
		}
		return userAvail;
	}

	/**
	 * To check whether the user name is already in use.
	 * 
	 * @param userName
	 * @return
	 * @throws ITeachException
	 */
	public boolean isEmailIdAvailable(String emailId) throws ITeachException {
		boolean userAvail = true;
		List<Users> usersByUserName = usersDao.getUserByEmailId(emailId);
		if (!ITeachUtility.isEmptyList(usersByUserName)) {
			userAvail = false;
		}
		return userAvail;
	}

	/**
	 * activating the user account by verifying email address.
	 * 
	 * @param activationKey
	 * @throws ITeachException
	 */
	public void activateUser(String activationKey) throws ITeachException {
		Users users = usersDao.findByActivationKey(activationKey);
		if (users != null) {
			users.setAccountActivated('Y');
			users.setEmailActivated('Y');
			usersDao.updateUser(users);
		}
	}
}
