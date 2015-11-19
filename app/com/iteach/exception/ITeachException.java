package com.iteach.exception;


public class ITeachException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ExceptionType exceptiontype;

	public ITeachException() {
		super();
	}

	public ITeachException(String message,ExceptionType ext) {
		super(message);
		exceptiontype=ext;
	}
	
	public ITeachException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ITeachException(String message, Throwable cause) {
		super(message, cause);
	}

	public ITeachException(String message) {
		super(message);
	}

	public ITeachException(Throwable cause) {
		super(cause);
	}

	public ExceptionType getExceptiontype() {
		return exceptiontype;
	}

}
