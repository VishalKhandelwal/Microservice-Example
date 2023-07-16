package com.Icwd.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String string) {
		super(string);// TODO Auto-generated constructor stub
	}

	public ResourceNotFoundException() {
		super("Resource not found !!"); 
	}
	
}
