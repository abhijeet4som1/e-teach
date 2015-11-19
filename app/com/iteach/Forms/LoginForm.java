package com.iteach.Forms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import play.data.validation.ValidationError;

/**
 * Login form
 * @author Abhijeet
 *
 */
public class LoginForm {

	private String userName;
	private String password;
	private String rememberMe;
	
	private String userType;
	private Map<String,String> errors=null;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRememberMe() {
		return rememberMe;
	}
	public void setRememberMe(String rememberMe) {
		this.rememberMe = rememberMe;
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
		if (StringUtils.isBlank(password)) {
			errors.add(new ValidationError("password", "Password should not be blank."));
		}
		
		return errors.isEmpty()?null:errors;
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
	@Override
	public String toString() {
		return "LoginForm [userName=" + userName + ", password=" + password + ", rememberMe=" + rememberMe
				+ ", userType=" + userType + ", errors=" + errors + "]";
	}
}
