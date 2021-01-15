package com.cg.exception;

public class InvalidNameexception extends Exception {
	

	public InvalidNameexception()
	{
		
	}
	public InvalidNameexception(String name)
	{
		super(name);
	}

}