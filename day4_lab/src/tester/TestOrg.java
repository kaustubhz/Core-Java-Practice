package tester;

import java.util.Scanner;

import com.org.*;

public class TestOrg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int count=0;
		System.out.println("\n How many employees? ");
		Employee[] arrOfEmployee = new Employee[sc.nextInt()] ;

		do {
			System.out.println("\n 1. Hire Manager");
			System.out.println("\n 2. Hire Worker");
			System.out.println("\n 3. Display Info of all");
			System.out.println("\n 4. Display Employee Info  ");
			System.out.println("\n 5. Increment Employee Salary  ");
			System.out.println("\n 6. EXIT ");
			System.out.print("\n Enter your choice: ");

			switch (sc.nextInt()) {
						case 1:
							if(count < arrOfEmployee.length) 
							{
								System.out.println("\nManager Name Manager Email Depatrment Number Basic Salary Performance Bonus");
								arrOfEmployee[count]=new Manager(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt()) ;
								System.out.println("\n Manager hired");
								count++;
							}
							else
							{
								System.out.println("\n No more space for employees");
							}
							break;
							
						case 2:
							if(count < arrOfEmployee.length)
							{
								System.out.println("\nWorker Name Worker Email Depatrment Number Basic Salary Hours worked Hourly Rate"); 
								arrOfEmployee[count]=new Worker(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextDouble()) ;
								System.out.println("\n Worker hired");
								count++;
							}
							else
							{
								System.out.println("\n No more space for employees");
							}
						break;
						
						case 3: 
							for(Employee temp:arrOfEmployee)
							{
								System.out.println("Employee Details are: "+temp);
							}
							break;
						case 4:
						{
							boolean found=false;
							int empNo;
							System.out.println("Enter employe ID: ");
							empNo=sc.nextInt();
							for(int i=0;i<arrOfEmployee.length;i++)
							{
								if(empNo == arrOfEmployee[i].getEmpId())
								{
									System.out.println(arrOfEmployee[i]);
									found=true;
									break;
								}
							}
							if(!found)
								System.out.println("Employee not found");
						}
							break;
						case 5:
						{
							boolean found=false;
							int empNo;
							System.out.println("Enter employe ID: ");
							empNo=sc.nextInt();
							for(int i=0;i<arrOfEmployee.length;i++)
							{
								if(empNo == arrOfEmployee[i].getEmpId())
								{
									System.out.println("\nBefore Hike\n"+arrOfEmployee[i]);
									arrOfEmployee[i].setBasicSalary(arrOfEmployee[i].getBasicSalary()+1000);
									System.out.println("\nAfter Hike\n"+arrOfEmployee[i]);
									found=true;
									break;
								}
							}
							if(!found)
								System.out.println("Employee not found");
						}
							break;
						case 6:
							System.out.println("\n EXITING");
							exit=true;
							break;
							default:
								System.out.println("Please enter valid choice");
			}
		} while (exit != true);

		sc.close();
	}

}
