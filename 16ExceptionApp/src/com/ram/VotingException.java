package com.ram;

public class VotingException extends RuntimeException {
	private String message;

	public VotingException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
