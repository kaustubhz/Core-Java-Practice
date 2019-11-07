package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.app.core.Courses;
import com.app.core.Student;

import cust_excp.StudentHandlingException;

enum Course {
	DAC, DBDA, DAI, DMC
}

public class ValidationRules {
	public static SimpleDateFormat objSDF;
	public static Date endDate;

	static {
		objSDF = new SimpleDateFormat("dd-MM-yyyy");
		try {
			endDate = objSDF.parse("01-01-1985");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Function overloading 
	public static String validatePrn(String studentPrn, Student[] arrOfStudent) throws StudentHandlingException {
		for (Student st : arrOfStudent) {
			if ((st == null))
				break;
			if (studentPrn.equals(st.getPrn()))
				throw new StudentHandlingException("Duplicate PRN");
		}
		return studentPrn;
	}

	@SuppressWarnings("unlikely-arg-type")
	public static String validatePrn(String studentPrn, ArrayList<Student> arrOfStudent)
			throws StudentHandlingException {
		if (arrOfStudent.contains(studentPrn))
			throw new StudentHandlingException("Duplicate PRN");
		return studentPrn;
	}
	
	public static String validatePrn(String studentPrn,HashMap<String,Student> objHashMap) throws StudentHandlingException
	{
		for(String s:objHashMap.keySet())
		{
			if(studentPrn.equals(s))
				throw new StudentHandlingException("Duplicate PRN : using HashMap");
		}
		return studentPrn;
	}

	public static String validateName(String studentName) throws StudentHandlingException {

		if (!(studentName.length() >= 4 && studentName.length() <= 10))
			throw new StudentHandlingException("Name not valid");

		return studentName;
	}

	public static String validateEmail(String studentEmail) throws StudentHandlingException {

		if (!(studentEmail.length() >= 4 && studentEmail.length() <= 10 && studentEmail.contains("@")))
			throw new StudentHandlingException("Email not valid");

		return studentEmail;
	}

	public static Courses validateCourse(String courseName) throws StudentHandlingException {
		/*
		 * Courses c=Enum.valueOf(Courses, courseName) if(!(courseName.equals("DAC") ||
		 * courseName.equals("DBDA") || courseName.equals("DAI") ||
		 * courseName.equals("DMC"))) throw new
		 * StudentHandlingException("COURSE NOT VALID");
		 */
		return Courses.valueOf(courseName.toUpperCase());
	}

	public static Date validateDob(String dob) throws ParseException, StudentHandlingException {
		Date dt = objSDF.parse(dob);
		if (dt.before(endDate))
			throw new StudentHandlingException("DoB should be after 1985");
		return dt;
	}
	
	public static Student isPrnExists(String studentPrn,HashMap<String,Student> objHashMap)
	{
			return objHashMap.get(studentPrn);
	}
	
}
