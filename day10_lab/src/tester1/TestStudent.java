package tester1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Courses;
import com.app.core.Student;

import static utils.ValidationRules.*;
import static utils.CollectionUtils.*;

public class TestStudent {

	public static void main(String[] args) {
		
		HashMap<String, Student> objHashMap=populateStudents();
		
		try
		{
		System.out.println("\n All Student(s) details");
		displayRecords();
//		createNewRecord(new Student("DAC-001", "Ankit", "ankit@gmail.com",
//					Courses.valueOf("DAC"), 85, new SimpleDateFormat("dd-MM-yyyy").parse("01-01-1995")));
//		displayRecords();
		//updateMarks("DAC-001");
		deleteStudent("DAC-001");
		displayRecords();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
//		System.out.println("\n PRN");
		/*
		 * for(Student s:objHashMap.values()) { System.out.println(" "+s); }
		 */

		}
	}

