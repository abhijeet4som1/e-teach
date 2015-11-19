package com.iteach.dao;

import java.util.List;
import java.util.Map;

import com.iteach.exception.ITeachException;

/**
 * Default dao interface
 * 
 * @author Abhijeet
 *
 * @param <T>
 */
public interface DefaultDao<T> {

	/**
	 * persisting the entity
	 * 
	 * @param entity
	 */
	public void saveEntity(T entity) throws ITeachException;

	/**
	 * merging the entity
	 * 
	 * @param entity
	 * @return
	 * @throws ITeachException
	 */
	public T merge(T entity) throws ITeachException;

	/**
	 * removing the entity
	 * 
	 * @param entity
	 * @return
	 * @throws ITeachException
	 */
	public void remove(T entity) throws ITeachException;

	/**
	 * Executing named query.
	 * 
	 * @param namedQuery
	 * @param params
	 * @return
	 * @throws ITeachException
	 */
	public List<T> executeNamedQuery(String namedQuery, Map<String, Object> params) throws ITeachException;

	/**
	 * Exceuting the native named query.
	 * @param namedNativeQuery
	 * @param params
	 * @return
	 * @throws ITeachException
	 */
	public List<Object[]> executeNativeNamedQuery(String namedNativeQuery, Map<String, Object> params)
			throws ITeachException;

}
