package com.iteach.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
    @NamedQuery(name="Users.findByUserName",
                query="SELECT u FROM Users u where u.userName= :userName"),
    @NamedQuery(name="Users.findByEmailId",
                query="SELECT u FROM Users u WHERE u.emailId = :emailId"),
    @NamedQuery(name="Users.findByActivationKey",
    			query="SELECT u FROM Users u WHERE u.activationKey = :activationKey")
})
@Entity
@Table(name="users")
public class Users{
	
	@Id
	@Column(name="user_name")
	private String userName;
	
	@Column(name="email_id")   
	private String emailId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="password_salt")
	private String passwordSalt;
	
	@Column(name="email_activated")
	private Character emailActivated;
	
	@Column(name="account_activated")
	private Character accountActivated;
	
	@Column(name="user_type")
	private String userType;
	
	@Column(name="activation_key")
	private String activationKey;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordSalt() {
		return passwordSalt;
	}
	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
	public Character getEmailActivated() {
		return emailActivated;
	}
	public void setEmailActivated(Character emailActivated) {
		this.emailActivated = emailActivated;
	}
	public Character getAccountActivated() {
		return accountActivated;
	}
	public void setAccountActivated(Character accountActivated) {
		this.accountActivated = accountActivated;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getActivationKey() {
		return activationKey;
	}
	public void setActivationKey(String activationKey) {
		this.activationKey = activationKey;
	}
	
}
