package lists;

import static utils.ValidationRules.*;
import java.util.HashMap;
import java.util.Scanner;
import com.app.core.Student;
import static utils.CollectionUtils.*;

public class TestStudent2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Student> studList = populateStudents();
			boolean exit = false;
			do {
				try {
					System.out.println("\n Welcome to Student portal");
					System.out.println("\n 1. Add Student");
					System.out.println("\n 2. Display All");
					System.out.println("\n 3. Update Student details");
					System.out.println("\n 4. Delete Student record");
					System.out.println("\n 10. Exit");
					System.out.println("Enter your choice: ");
					switch (sc.nextInt()) {
					case 1: {
						String prn = sc.next();
						studList.put(prn,
								new Student(validatePrn(prn, studList), validateName(sc.next()),
										validateEmail(sc.next()), validateCourse(sc.next()), sc.nextInt(),
										validateDob(sc.next())));
						System.out.println("\n New student record added successfully");
					}
						break;

					case 2: {
						System.out.println("\n Student record(s) are: \n");
						displayRecords();
					}
						break;
					case 3: 
						System.out.println("Enter prn: ");
						if(updateMarks(sc.next())==1)
						System.out.println("\n Student record updated ");
						else
							System.out.println("Something went wrong");
					
						break;
					case 4: {
						System.out.println("Enter prn: ");
						deleteStudent(sc.next());
						System.out.println("\n Student record deleted ");
					}
						break;
					case 10: {
						exit = true;
						System.out.println("\n EXITING.....EXITED");
					}
						break;
					default: {
						System.out.println("\n Please enter valid choice");
					}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} while (exit != true);

		}

	}

}
