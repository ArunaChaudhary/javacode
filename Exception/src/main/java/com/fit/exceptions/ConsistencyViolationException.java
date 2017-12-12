package com.fit.exceptions;

public class ConsistencyViolationException extends Exception {

	private static final long serialVersionUID = -7582999649044881407L;

	public ConsistencyViolationException() {
		super();
	}

	public ConsistencyViolationException(final String message) {
		super(message);
	}

	public ConsistencyViolationException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ConsistencyViolationException(final Throwable cause) {
		super(cause);
	}
}
