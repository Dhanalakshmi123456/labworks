package com.cg.DAOImpl;

import javax.naming.InvalidNameException;

import com.cg.DAO.EmployeeDAO;
import com.cg.domain.Employee;
import com.cg.exception.InvalidAgeexception;
import com.cg.exception.InvalidSalaryexception;

public class EmployeeDAoImpl implements EmployeeDAO {
	
	

	@Override
	public void checkEmployee( String name,int age,int salary) throws InvalidNameException,InvalidAgeexception,InvalidSalaryexception
	{
		String[] val=name.split(" ");
		Employee obj=new Employee();
	if(name.contains("A-Za-z+"))
//		if((!val[0].contains("[A-Za-z]+"))&&(!val[1].contains("[A-Za-z]+")))
		{
			throw new InvalidNameException("Sorry! Your name is invalid.Enter Correct Format.Thank You.");
		}
		System.out.println("Your name is "+name);
		 if(age<15)
		{
			throw new InvalidAgeexception("Sorry! Your age is invalid.Enter Correct Format.Thank You.");
		}
		 System.out.println("Your age is "+age);
		 if (salary<3000)
		{
			throw new InvalidSalaryexception("Sorry!Your Salary is less than the limit.");
		}
		System.out.println("Your Salary is "+salary);
	}

}