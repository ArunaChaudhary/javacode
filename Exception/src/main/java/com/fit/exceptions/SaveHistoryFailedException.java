package com.fit.exceptions;

public class SaveHistoryFailedException extends RuntimeException {
	private static final long serialVersionUID = 7746615984980328833L;

	public SaveHistoryFailedException() {
		super("Can't save in history because the given criteria was not match with any records in data-base.");
	}

	public SaveHistoryFailedException(final String message) {
		super(message);
	}

	public SaveHistoryFailedException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public SaveHistoryFailedException(final Throwable cause) {
		super(cause);
	}
}
