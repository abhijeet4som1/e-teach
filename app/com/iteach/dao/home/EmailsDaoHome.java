package com.iteach.dao.home;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.iteach.dao.EmailsDao;
import com.iteach.entity.Emails;
import com.iteach.exception.ITeachException;

/**
 * Emails entity implementation layer.
 * 
 * @author Abhijeet
 *
 */
public class EmailsDaoHome extends AbstractDaoHome<Emails> implements EmailsDao<Emails> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Emails> getEmailsByStatus(Character status) throws ITeachException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("emailStatus", status);
		return executeNamedQuery("Emails.findByStatus", params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Emails updateEmails(Emails entity) throws ITeachException {
		return merge(entity);
	}

}
