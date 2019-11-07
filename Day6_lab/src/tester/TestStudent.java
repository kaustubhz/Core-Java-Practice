package tester;

import java.util.Scanner;

import com.app.core.*;

import custom_exceptions.StudentHandlingException;

public class TestStudent {

	public static void main(String[] args) {
		/*
		 * // System.out.print("\n How many students?");
		 * 
		 * // try (Scanner sc=new Scanner(System.in)) //{
		 * 
		 * Student[] arrOfStudent = { new Student("DAC-001", "Buland",
		 * "buland@hotmail.com", "DAC", 99), new Student("DAC-002", "Eli",
		 * "eli@hotmail.com", "DAC", 39), new Student("DAC-003", "Michael",
		 * "michael@hotmail.com", "DAC", 79) }; Student[] arrOfStudent=new
		 * Student[sc.nextInt()]; for(int i=0;i<arrOfStudent.length;i++) {
		 * arrOfStudent[i]=new
		 * Student(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble()); } //Student
		 * objStudent = new Student("DAC-003", "Michael", "michael@hotmail.com", "DAC",
		 * 79); //for (Student temp : arrOfStudent) { //if (temp.equals(objStudent)) {
		 * // System.out.println("Matching records"); //throw new
		 * StudentHandlingException("Student already present"); //} /* // * else
		 * System.out.println(temp); //
		 */
		/*
		 * }catch(
		 * 
		 * StudentHandlingException s) { System.out.println(s.getMessage()); } }
		 */
		Student[] arrOfStudents=new Student[10];
		arrOfStudents[0] = new Student("DAC-001", "Buland","buland@hotmail.com", "DAC", 99);
		arrOfStudents[1] = new Student("DAC-002", "Eli","eli@hotmail.com", "DAC", 39);
		arrOfStudents[2] = new Student("DAC-003", "Michael","michael@hotmail.com", "DAC", 79);
		try(Scanner sc=new Scanner(System.in); ) {					
					
			for(int i=3; i < arrOfStudents.length ; i++)
			{
				System.out.println("\n PRN Name Email Course Marks");
				arrOfStudents[i]=new Student(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
			}
			/*
			 * System.out.println("Enter new student details: ");
			 * 
			 * Student s1=new
			 * Student(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
			 */
			for(Student s: arrOfStudents)
			{
			//	if(s.equals(s1))
					throw new StudentHandlingException("Student already exists");
			}
			System.out.println("After exception thrown");
		}
		catch(StudentHandlingException s)
		{
			System.out.println(s.getMessage());
		}
}
}