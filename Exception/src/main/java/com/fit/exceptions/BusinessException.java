package com.fit.exceptions;

public class BusinessException extends Exception {

	private static final long serialVersionUID = -3195384828729430826L;

	public BusinessException() {
		super();
	}

	public BusinessException(final String message) {
		super(message);
	}

	public BusinessException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public BusinessException(final Throwable cause) {
		super(cause);
	}
}
