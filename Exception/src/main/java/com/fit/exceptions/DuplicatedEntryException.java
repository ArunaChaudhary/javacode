package com.fit.exceptions;

public class DuplicatedEntryException extends Exception {
	private static final long serialVersionUID = -1933110473702561053L;

	public DuplicatedEntryException() {
		super();
	}

	public DuplicatedEntryException(final String message) {
		super(message);
	}

	public DuplicatedEntryException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public DuplicatedEntryException(final Throwable cause) {
		super(cause);
	}
}
