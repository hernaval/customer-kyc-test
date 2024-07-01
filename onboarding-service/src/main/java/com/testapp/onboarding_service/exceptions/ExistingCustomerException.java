package com.testapp.onboarding_service.exceptions;

public class ExistingCustomerException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1427016070580977287L;

	public ExistingCustomerException(String message) {
		super(message);
	}
	
}
