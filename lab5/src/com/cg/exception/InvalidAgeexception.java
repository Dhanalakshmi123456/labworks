package com.cg.exception;

public class InvalidAgeexception extends Exception {
	public InvalidAgeexception()
	{
		
	}
	public InvalidAgeexception(String age)
	{
		super(age);
	}

}