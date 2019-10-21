package utils;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.*;
import static utils.ValidationRules.*;
import cust_excp.StudentHandlingException;

public class CollectionUtils {
	public static HashMap<String, Student> hashMap = new HashMap<>();;

	public static HashMap<String, Student> populateStudents() {

		try {
			System.out.println("\n Populating record(s)\n");
			System.out.println(hashMap.put("DAC-001", new Student("DAC-001", "Ankit", "ankit@gmail.com",
					Courses.valueOf("DAC"), 85, new SimpleDateFormat("dd-MM-yyyy").parse("01-01-1995"))));
			System.out.println(hashMap.put("DAC-003", new Student("DAC-003", "Anil", "anil@gmail.com",
					Courses.valueOf("DBDA"), 45, new SimpleDateFormat("dd-MM-yyyy").parse("01-11-1995"))));
			System.out.println(hashMap.put("DAC-004", new Student("DAC-004", "Amey", "amey@gmail.com",
					Courses.valueOf("DAI"), 65, new SimpleDateFormat("dd-MM-yyyy").parse("07-11-1995"))));
			System.out.println(hashMap.put("DAC-002", new Student("DAC-002", "Anuj", "anuj@gmail.com",
					Courses.valueOf("DMC"), 59, new SimpleDateFormat("dd-MM-yyyy").parse("23-09-1995"))));
			System.out.println(hashMap.put("DAC-008", new Student("DAC-008", "Advay", "advay@gmail.com",
					Courses.valueOf("DAC"), 79, new SimpleDateFormat("dd-MM-yyyy").parse("14-02-1995"))));
			System.out.println(hashMap.put("DAC-008", new Student("DAC-008", "Advaya", "advaya@gmail.com",
					Courses.valueOf("DAC"), 79, new SimpleDateFormat("dd-MM-yyyy").parse("14-02-1995"))));
			return hashMap;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return hashMap;
	}

	public static void displayRecords() {
		for (Student s : hashMap.values()) {
			System.out.println(" " + s);
		}
	}

	public static void createNewRecord(Student objStudent) throws StudentHandlingException {
		
		hashMap.put(validatePrn(objStudent.getPrn(), hashMap), objStudent);
		
	}

	@SuppressWarnings("unused")
	public static void updateMarks(String studentPRN) throws StudentHandlingException {
		Student s=isPrnExists(studentPRN, hashMap);
			if(s.equals(null))
				throw new StudentHandlingException("PRN not found");
			System.out.println("\n Valid PRN");
			int studentMarks=0;
			try(Scanner sc=new Scanner(System.in)){
				System.out.println("\n Enter marks");
				studentMarks=sc.nextInt();
				 s.setMarks(studentMarks);
				 System.out.println("\n Marks updated for "+studentPRN);
			}
			
			
		
	}
	public static void deleteStudent(String studentPRN) throws StudentHandlingException {
		Student s=isPrnExists(studentPRN, hashMap);
			if(s.equals(null))
				throw new StudentHandlingException("PRN not found");
			System.out.println("\n PRN found");
			hashMap.remove(studentPRN);
			System.out.println("Student record successfully deleted");
			}
}
