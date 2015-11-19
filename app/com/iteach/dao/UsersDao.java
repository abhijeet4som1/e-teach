package com.iteach.dao;

import java.util.List;

import com.google.inject.ImplementedBy;
import com.iteach.dao.home.UsersDaoHome;
import com.iteach.exception.ITeachException;

/**
 * User entity interface layer
 * @author Abhijeet
 *
 */
@ImplementedBy(UsersDaoHome.class)
public interface UsersDao<T> extends DefaultDao<T>{
	
	/**
	 * getting the user by the user name.
	 * @param userName
	 * @return
	 * @throws ITeachException
	 */
	public List<T> getUserByUserName(String userName)throws ITeachException;
	
	/**
	 * getting the user by emailId
	 * @param emailId
	 * @return
	 * @throws ITeachException
	 */
	public List<T> getUserByEmailId(String emailId)throws ITeachException;
	
	/**
	 * updating user information
	 * @param user
	 * @return
	 * @throws ITeachException
	 */
	public T updateUser(T user)throws ITeachException;
	
	/**
	 * adding new record in the users table
	 * @param user
	 * @throws ITeachException
	 */
	public void insertNewUser(T user)throws ITeachException;
	
	/**
	 * Checking for the availability of the activation key.
	 * @return
	 * @throws ITeachException
	 */
	public T findByActivationKey(String activationKey)throws ITeachException;

}
