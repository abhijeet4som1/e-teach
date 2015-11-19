package com.iteach.dao.home;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.iteach.dao.UsersDao;
import com.iteach.entity.Users;
import com.iteach.exception.ITeachException;
import com.iteach.utility.ITeachUtility;

/**
 * User entity interface implementation class
 * 
 * @author Abhijeet
 *
 */
@Repository
public class UsersDaoHome extends AbstractDaoHome<Users> implements UsersDao<Users> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Users updateUser(Users user) throws ITeachException {
		return merge(user);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Users> getUserByUserName(String userName) throws ITeachException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userName", userName);
		return executeNamedQuery("Users.findByUserName", params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Users> getUserByEmailId(String emailId) throws ITeachException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("emailId", emailId);
		return executeNamedQuery("Users.findByEmailId", params);
	}

	/**
	 * inserting new users.
	 */
	@Override
	public void insertNewUser(Users user) throws ITeachException {
		saveEntity(user);
	}

	@Override
	public Users findByActivationKey(String activationKey) throws ITeachException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("activationKey", activationKey);
		List<Users> usersList = executeNamedQuery("Users.findByActivationKey", params);
		if (!ITeachUtility.isEmptyList(usersList)) {
			return usersList.get(0);
		} else {
			return null;
		}
	}

}
