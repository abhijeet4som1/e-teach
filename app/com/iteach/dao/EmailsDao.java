package com.iteach.dao;

import java.util.List;

import com.google.inject.ImplementedBy;
import com.iteach.dao.home.EmailsDaoHome;
import com.iteach.exception.ITeachException;

/**
 * Emails entity dao layer
 * @author Abhijeet
 *
 * @param <T>
 */
@ImplementedBy(EmailsDaoHome.class)
public interface EmailsDao<T> extends DefaultDao<T> {
	
	/**
	 * method to get emails by status
	 * @param status
	 * @return
	 * @throws ITeachException
	 */
	public List<T> getEmailsByStatus(Character status)throws ITeachException;
	
	/**
	 * Method to update the emails entity.
	 * @param entity
	 * @return
	 * @throws ITeachException
	 */
	public T updateEmails(T entity)throws ITeachException;

}
