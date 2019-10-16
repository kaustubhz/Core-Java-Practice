package utils;

import com.app.core.Student;

import custom_exceptions.StudentHandlingException;

public class ValidationRules{
	
	public static String validatePrn(String studentPrn,Student[] arr) throws Exception
	{
		for(Student s: arr)
		{
			if(s!=null)
				if(studentPrn.equals(s.getPrn()))
					throw new StudentHandlingException("Student already exists");
		}
		return studentPrn;
	}
	
	public static String validateName(String studentName) throws Exception
	{
		if(studentName.length()<4 || studentName.length()>10)
			throw new StudentHandlingException("Student name not in limit");
		return studentName;
	}
	
	public static String validateEmail(String studentEmail) throws Exception
	{
		if(studentEmail.length()<4 || studentEmail.length()>10 || !studentEmail.contains("@"))
		{		
			throw new StudentHandlingException("Invalid email");
		}
		return studentEmail;
	}
	
	public static String validateCourse(String coursename) throws Exception
	{
		String courseArray[]= {"DAC","DBDA","DMC","DAI"};		
		for(String course:courseArray)
		{
			if(course.equals(coursename))
				return coursename;
		}
		throw new StudentHandlingException("Invalid course entered");
	}
	
}
