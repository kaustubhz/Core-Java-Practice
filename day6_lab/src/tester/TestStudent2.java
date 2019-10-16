package tester;

import static utils.ValidationRules.*;

import java.util.Scanner;

import com.app.core.Student;

public class TestStudent2 {

	public static void main(String[] args) {

		Student[] arrOfStudents = new Student[5];
		arrOfStudents[0] = new Student("DAC-001", "Buland", "buland@hotmail.com", "DAC", 99);
		arrOfStudents[1] = new Student("DAC-002", "Eli", "eli@hotmail.com", "DAC", 39);
		arrOfStudents[2] = new Student("DAC-003", "Michael", "michael@hotmail.com", "DAC", 79);
		int counter = 3;
		
			try (Scanner sc = new Scanner(System.in)) {
				while (counter < arrOfStudents.length) {
				System.out.println("\n Enter new Student details [ PRN Name Email Course Marks ]");
				
				arrOfStudents[counter] = new Student(validatePrn(sc.next(), arrOfStudents), validateName(sc.next()),
						validateEmail(sc.next()), validateCourse(sc.next()), sc.nextDouble());
				
				System.out.println("New student added successfully");
			
				counter++;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}					
		
		for(Student temp:arrOfStudents)
		{
			if(temp==null)
				break;
			System.out.println("\n "+temp);
		}
	}

}
