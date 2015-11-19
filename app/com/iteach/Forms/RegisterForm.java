package com.iteach.Forms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import play.data.validation.ValidationError;

/**
 * Register form to get the registration details.
 * 
 * @author Abhijeet
 *
 */
public class RegisterForm {
	private String userName;
	private String emailAddress;
	private String password;
	private String cnfrmPassword;
	private String userType;
	
	private Map<String,String> errors=null;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCnfrmPassword() {
		return cnfrmPassword;
	}

	public void setCnfrmPassword(String cnfrmPassword) {
		this.cnfrmPassword = cnfrmPassword;
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * method to validate form input data
	 * @return
	 */
	public List<ValidationError> validate() {

		List<ValidationError> errors=new LinkedList<ValidationError>();
		if (StringUtils.isBlank(userName)) {
			errors.add(new ValidationError("userName", "User name is mandatory."));
		}
		if (StringUtils.isBlank(emailAddress)) {
			errors.add(new ValidationError("emailAddress", "Email Address is mandatory."));
		}
		if (StringUtils.isNotBlank(password) && StringUtils.isNotBlank(cnfrmPassword)) {
			if (!password.equals(cnfrmPassword)) {
				errors.add(new ValidationError("password", "Password didn't match."));
				errors.add(new ValidationError("cnfrmPassword", ""));
			}
		} else {
			if (StringUtils.isBlank(password)) {
				errors.add(new ValidationError("password", "Password must not be left blank."));
			}
			if (StringUtils.isBlank(cnfrmPassword)) {
				errors.add(new ValidationError("cnfrmPassword", "Password must not be left blank."));
			}
		}
		return errors.isEmpty()?null:errors;
	}

	@Override
	public String toString() {
		return "RegisterForm [userName=" + userName + ", emailAddress=" + emailAddress + ", password=" + password
				+ ", cnfrmPassword=" + cnfrmPassword + "]";
	}
	
	/**
	 * adding error messages
	 * @param key
	 * @param message
	 */
	public void addErrorMessage(String key,String message){
		if(errors==null){
			errors=new HashMap<String,String>();
		}
		errors.put(key, message);
	}

}
