package com.tis.domain;

//@Data
public class NotUserException extends Exception {
	
	public NotUserException() {
		super("NotUserException");
	}
	
	public NotUserException(String message) {
		super(message);
	}
	
	
}
