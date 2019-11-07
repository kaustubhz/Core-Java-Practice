package tester;



import java.util.ArrayList;


import com.app.core.Employee;
import static collectionutils.EmployeeRecords.*;
import threads.MyThread;

public class TestMain {

	public static void main(String[] args) {
		ArrayList<Employee> empRecords=populateEmpRecords();
		 
		Thread t1=new Thread(new MyThread(empRecords),"t1");
		
		Thread t2=new Thread(new MyThread(empRecords),"t2");
		
		Thread t3=new Thread(new MyThread(empRecords),"t3");
		try
		{
			t1.start();
			t2.start();
			t3.start();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
