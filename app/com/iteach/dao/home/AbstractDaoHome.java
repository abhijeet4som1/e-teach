package com.iteach.dao.home;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.iteach.dao.DefaultDao;
import com.iteach.exception.ITeachException;
import com.iteach.utility.ITeachUtility;

import play.db.jpa.JPA;

/**
 * Abstarct default dao home
 * @author Abhijeet
 *
 * @param <T>
 */
public abstract class AbstractDaoHome<T> implements DefaultDao<T>{

	/**
	 * getting the current entity manager.
	 * @return
	 */
	public EntityManager getEntityManager(){
		return JPA.em();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void saveEntity(T entity) throws ITeachException{
		getEntityManager().persist(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T merge(T entity) throws ITeachException {
		return getEntityManager().merge(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void remove(T entity) throws ITeachException {
		getEntityManager().remove(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> executeNamedQuery(String namedQuery, Map<String, Object> params) throws ITeachException {
		Query query=getEntityManager().createNamedQuery(namedQuery);
		if(!ITeachUtility.isEmptyMap(params)){
			for(Entry<String,Object> entry:params.entrySet()){
				query.setParameter(entry.getKey(), entry.getValue());
			}
		}
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> executeNativeNamedQuery(String namedNativeQuery, Map<String, Object> params)
			throws ITeachException {
		Query query=getEntityManager().createNamedQuery(namedNativeQuery);
		if(!ITeachUtility.isEmptyMap(params)){
			for(Entry<String,Object> entry:params.entrySet()){
				query.setParameter(entry.getKey(), entry.getValue());
			}
		}
		return query.getResultList();
	}

}
