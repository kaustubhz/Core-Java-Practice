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
			hashMap.put("DAC-001", new Student("DAC-001", "Ankit", "ankit@gmail.com", Courses.valueOf("DAC"), 85,
					new SimpleDateFormat("dd-MM-yyyy").parse("01-01-1995")));
			hashMap.put("DAC-003", new Student("DAC-003", "Anil", "anil@gmail.com", Courses.valueOf("DBDA"), 45,
					new SimpleDateFormat("dd-MM-yyyy").parse("01-11-1995")));
			hashMap.put("DAC-004", new Student("DAC-004", "Amey", "amey@gmail.com", Courses.valueOf("DAI"), 65,
					new SimpleDateFormat("dd-MM-yyyy").parse("07-11-1995")));
			hashMap.put("DAC-002", new Student("DAC-002", "Anuj", "anuj@gmail.com", Courses.valueOf("DMC"), 59,
					new SimpleDateFormat("dd-MM-yyyy").parse("23-09-1995")));
			hashMap.put("DAC-008", new Student("DAC-008", "Advay", "advay@gmail.com", Courses.valueOf("DAC"), 79,
					new SimpleDateFormat("dd-MM-yyyy").parse("14-02-1995")));
			hashMap.put("DAC-008", new Student("DAC-008", "Advaya", "advaya@gmail.com", Courses.valueOf("DAC"), 79,
					new SimpleDateFormat("dd-MM-yyyy").parse("14-02-1995")));
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

	public static int updateMarks(String studentPRN) throws StudentHandlingException,Exception {
		Student s = isPrnExists(studentPRN, hashMap);
		if (s==null)
			throw new StudentHandlingException("PRN not found");
		System.out.println("\n Valid PRN");
//		int studentMarks;
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("\n Enter marks");
			int studentMarks = 0;
			System.out.println("\n Marks entered: "+studentMarks);
			/*
			 * Student s1=hashMap.get(studentPRN); System.out.println(s1);
			 */
//			s1.setMarks(studentMarks);
//			hashMap.put(s1.getPrn(), s1);
			
			System.out.println("\n Marks updated for " + studentPRN);
			
			return 1;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
return 0;
	}

	public static void deleteStudent(String studentPRN) throws StudentHandlingException {
		Student s = isPrnExists(studentPRN, hashMap);
		if (s==null)
			throw new StudentHandlingException("PRN not found");
		System.out.println("\n PRN found");
		hashMap.remove(studentPRN);
		System.out.println("Student record successfully deleted");
	}
}
