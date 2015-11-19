package com.iteach.controllers;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;

import com.iteach.Forms.LoginForm;
import com.iteach.Forms.RegisterForm;
import com.iteach.constants.StringConstants;
import com.iteach.exception.ExceptionType;
import com.iteach.exception.ITeachException;
import com.iteach.services.LoginService;
import com.iteach.utility.ITeachUtility;

import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Login controller
 * 
 * @author Abhijeet
 *
 */
@org.springframework.stereotype.Controller
public class LoginController extends Controller {

	/**
	 * Injecting the service class
	 */
	@Inject
	private LoginService loginService;

	/**
	 * Controller method to register the student/teacher
	 * 
	 * @return
	 */
	@Transactional
	public Result register() {
		try {
			Form<RegisterForm> registerForm = Form.form(RegisterForm.class);
			// binding the form with the request
			registerForm = registerForm.bindFromRequest(request());
			if (registerForm.hasErrors()) {
				return badRequest(registerForm.errorsAsJson());
			} else {
				RegisterForm registerDetails = registerForm.get();
				registerDetails = loginService.validateRegisterForm(registerDetails);
				if (!ITeachUtility.isEmptyMap(registerDetails.getErrors())) {
					return badRequest(ITeachUtility.toJson(registerDetails.getErrors()));
				} else {
					loginService.registerNewUser(registerDetails);
					return ok("User successfully registered.");
				}
			}
		} catch (ITeachException e) {
			return badRequest(e.getMessage());
		} catch (Exception e) {
			return badRequest(e.getMessage());
		}
	}

	/**
	 * Controller method to register the student/teacher
	 * 
	 * @return
	 */
	@Transactional
	public Result processLogin() {
		try {
			Form<LoginForm> loginFormPlay = Form.form(LoginForm.class);
			// binding the form with the request
			loginFormPlay = loginFormPlay.bindFromRequest(request());
			if (loginFormPlay.hasErrors()) {
				return badRequest(loginFormPlay.errorsAsJson());
			} else {
				LoginForm loginFormDetails = loginFormPlay.get();
				loginFormDetails = loginService.login(loginFormDetails);
				if (!ITeachUtility.isEmptyMap(loginFormDetails.getErrors())) {
					return badRequest(ITeachUtility.toJson(loginFormDetails.getErrors()));
				} else {
					if (StringConstants.USER_TYPE_STUDENT.equals(loginFormDetails.getUserType())) {
						return redirect("/studentHome");
					} else if (StringConstants.USER_TYPE_TUTOR.equals(loginFormDetails.getUserType())) {
						return redirect("/tutorHome");
					} else {
						throw new ITeachException("Invalid user type.", ExceptionType.DATA_EXCEPTION);
					}
				}
			}
		} catch (ITeachException e) {
			return badRequest(e.getMessage());
		} catch (Exception e) {
			return badRequest(e.getMessage());
		}
	}

	/**
	 * activating the user account.
	 * 
	 * @return
	 */
	@Transactional
	public Result activate() {
		try {
			String activationKey = request().getQueryString("userKey");
			System.out.println("activationKey:" + activationKey);
			if (StringUtils.isBlank(activationKey)) {
				throw new Exception("Activation key not received.");
			}else{
				loginService.activateUser(activationKey);
				return redirect("/");
			}
		} catch (ITeachException e) {
			return badRequest(e.getMessage());
		} catch (Exception e) {
			return badRequest(e.getMessage());
		}
	}
}
