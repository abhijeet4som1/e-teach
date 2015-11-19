package com.iteach.utility;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.iteach.constants.StringConstants;
import com.iteach.exception.ITeachException;

/**
 * Utility class for common functions.
 * 
 * @author Abhijeet
 *
 */
public class ITeachUtility {

	private ITeachUtility() {

	}

	/**
	 * To check whether the map is empty or not.
	 * 
	 * @param inputMap
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isEmptyMap(Map inputMap) {
		return inputMap == null || inputMap.isEmpty();
	}

	/**
	 * To check whether the list is empty.
	 * 
	 * @param inputList
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isEmptyList(List inputList) {
		return inputList == null || inputList.isEmpty();
	}

	/**
	 * To check whether the input set is empty or not.
	 * 
	 * @param inputSet
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isEmptySet(Set inputSet) {
		return inputSet == null || inputSet.isEmpty();
	}

	/**
	 * Converting to json data
	 * 
	 * @param inputModel
	 * @return
	 */
	public static String toJson(Object inputModel) throws ITeachException {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(inputModel);
		} catch (JsonGenerationException e) {
			throw new ITeachException(e);
		} catch (JsonMappingException e) {
			throw new ITeachException(e);
		} catch (IOException e) {
			throw new ITeachException(e);
		}
	}
	
	/**
	 * getting the property value.
	 * @param key
	 * @param isDycrpt
	 * @return
	 */
	public static String getPropValue(String key,boolean isDycrpt){
		String result=play.Play.application().configuration().getString(key);
		if(StringUtils.isNotBlank(result) && isDycrpt){
			try {
				result=EncryptionUtility.decrypt(result, StringConstants.encryptionKey);
			} catch (GeneralSecurityException | IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * converting string to set
	 * @param inputString
	 * @param delimeter
	 * @return
	 */
	public static Set<String> getStringAsSet(String inputString,String delimeter){
		Set<String> stringSet=null;
		if(StringUtils.isNotBlank(inputString)){
			stringSet=new HashSet<String>(Arrays.asList(inputString.split(delimeter)));
		}
		return stringSet;
	}
}
