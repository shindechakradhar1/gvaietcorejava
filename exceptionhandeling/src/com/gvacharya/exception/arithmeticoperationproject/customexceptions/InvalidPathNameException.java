package com.gvacharya.exception.arithmeticoperationproject.customexceptions;

public class InvalidPathNameException extends Exception{

	public InvalidPathNameException() {
		super();
	}

	public InvalidPathNameException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidPathNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidPathNameException(String message) {
		super(message);
	}

	public InvalidPathNameException(Throwable cause) {
		super(cause);
		
	}

	
}
