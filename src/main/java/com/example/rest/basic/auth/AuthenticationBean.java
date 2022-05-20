package com.example.rest.basic.auth;

public class AuthenticationBean {
	
	public String message;

	public AuthenticationBean(String message) {
		super();
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return " [message=" + message + "]";
	}
	
	

}
