package com.njit.dianyi.utils.exception;

public class LoginMissingArgumentsException extends Exception{
	private String message;
	
	
	
	public LoginMissingArgumentsException(String message) {
		this.message = message;
	}



	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}
