package tester;

import java.util.HashMap;

import com.app.core.Department;
import threads.MyThreads;
import static collectionutils.DepartmentRecords.*;

public class TestMain {

	public static void main(String[] args) {
		HashMap<Integer, Department> allDepartments = populateDepartment();
		int i=0;
		Thread threads[]=new Thread[allDepartments.size()];
		for(int key: populateDepartment().keySet())
		{
			threads[i]=new Thread(new MyThreads(allDepartments.get(key).getDeptName(),allDepartments.get(key).getEmployeeList()),"Thread "+(i+1));
			i++;
		}
		for(int temp=0;temp<threads.length;temp++)
		{
			System.out.println(Thread.currentThread().getName()+" is about to start");
			threads[temp].start();
		}
	
	}

}
