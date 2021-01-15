package com.cg.DAO;

import javax.naming.InvalidNameException;

import com.cg.exception.InvalidAgeexception;
import com.cg.exception.InvalidSalaryexception;

public interface EmployeeDAO {
	
	
	void checkEmployee(String name,int age,int salary) throws InvalidNameException,InvalidAgeexception,InvalidSalaryexception;


}