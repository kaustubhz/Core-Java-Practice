package lists;

import static utils.ValidationRules.*;
import java.util.ArrayList;
import java.util.Scanner;
import com.app.core.Student;

public class TestStudent2 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){			
			ArrayList<Student> studentList= new ArrayList<>(10);
			boolean exit=false;
			do
			{
				try {
				System.out.println("\n Welcome to Student portal");
				System.out.println("\n 1. Add Student");
				System.out.println("\n 2. Display All");
				System.out.println("\n 3. Exit");
				System.out.println("Enter your choice: ");
				switch(sc.nextInt())
				{
				case 1:{
								studentList.add(new Student(validatePrn(sc.next(),studentList),validateName(sc.next()),
						  validateEmail(sc.next()), validateCourse(sc.next()),
						  sc.nextInt(),validateDob(sc.next())));
								System.out.println("\n New student record added successfully");					
							}
				break;
				
				case 2:
				{
					System.out.println("\n Student record(s) are: \n"+studentList);
				}
				break;
				
				case 3: {
						exit=true;
						System.out.println("\n EXITING.....EXITED");
				}
				break;
				default:
				{
						System.out.println("\n Please enter valid choice");
				}}}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			//studentList.add(new Student("104","Devendra", "devendra@gov.in", Courses.valueOf("DAC"), 85, new SimpleDateFormat("dd-MM-yy").parse("12-03-1975")));
			
			
			
			
			}while(exit!=true);
//			System.out.println("Using arrayList:\n"+studentList);
//			System.out.println("Size: "+studentList.size());
		} /*
			 * catch (ParseException e) { System.out.println(e.getMessage()); }
			 * catch(Exception e1) { System.out.println("\n "+e1.getMessage()); }
			 */

	}

}
