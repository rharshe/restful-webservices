package com.example.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	
	public String message;

	public HelloWorldBean(String message) {
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
