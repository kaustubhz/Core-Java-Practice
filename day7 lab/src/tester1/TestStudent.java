package tester1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.app.core.Student;

import static utils.ValidationRules.*;

public class TestStudent {

	public static void main(String[] args) {

		// System.out.println("\n How many students?");

		Student[] Students = new Student[4];
		try {
			Students[0] = new Student("101", "pranjan", "pranjan@gmail.com", "dac", 80,new SimpleDateFormat("dd-M-yy").parse("09-09-1996"));
			Students[1] = new Student("102", "kaustubh", "kau@gmail.com", "dac", 90,new SimpleDateFormat("dd-MM-yy").parse("30-11-1996"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int noOfStudents = 2;
		/*
		 * Student s1=new Student("101","pranjan","pranjan@gmail.com","electronics",80);
		 * Student s2=new Student("101","pranjan","pranjan@gmail.com","electronics",80);
		 */
//		System.out.println(s1.equals(s2));

		// try with resource
		
		  try (Scanner sc = new Scanner(System.in);) { while (noOfStudents <
		  Students.length) { System.out.println("\n PRN Name Email Course Marks");
		  Student s3 = new Student(validatePrn(sc.next(), Students),
		  validateName(sc.next()), validateEmail(sc.next()), validateCourse(sc.next()),
		  sc.nextInt(),validateDob(sc.next()));
		  
		  Students[noOfStudents] = s3;
		  System.out.println("\n New student record added successfully\n" + s3);
		  noOfStudents++; } } catch (Exception e) { System.out.println(e.getMessage());
		  }
		 
		System.out.println("\n Student record(s) are \n");
		for (Student st : Students) {
			if (!(st == null))

				System.out.println(st);

		}
	}
}
