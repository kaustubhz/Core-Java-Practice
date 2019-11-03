package collectionutils;

import java.util.ArrayList;

import com.app.core.Employee;

public class EmployeeRecords {

	private static ArrayList<Employee> employeeList1=new ArrayList<>();
	private static ArrayList<Employee> employeeList2=new ArrayList<>();
	private static ArrayList<Employee> employeeList3=new ArrayList<>();
	
	public static ArrayList<Employee> populateEmpRecords1()
	{
		employeeList1.add(new Employee(1012,"Narendra",90000));
		employeeList1.add(new Employee(1024,"Amit",75000));
		employeeList1.add(new Employee(1018,"Nitin",82000));
		employeeList1.add(new Employee(1032,"Piyush",87000));				
		
		return employeeList1;
	}
	
	public static ArrayList<Employee> populateEmpRecords2()
	{		
		employeeList2.add(new Employee(2020,"Nirmala",50000));
		employeeList2.add(new Employee(2028,"Harsimrat",42000));
		employeeList2.add(new Employee(2024,"Sushma",56000));
		employeeList2.add(new Employee(2032,"Arun",67000));		
		
		return employeeList2;
	}
	
	public static ArrayList<Employee> populateEmpRecords3()
	{			
		employeeList3.add(new Employee(3010,"Devendra",40000));
		employeeList3.add(new Employee(3016,"Sudhir",31000));
		employeeList3.add(new Employee(3022,"Pankaja",36000));
		employeeList3.add(new Employee(3012,"Vinod",29000));		
		
		return employeeList3;
	}
}
