package collectionutils;

import java.util.ArrayList;

import com.app.core.Employee;

public class EmployeeRecords {

	private static ArrayList<Employee> employeeList=new ArrayList<>();

	
	public static ArrayList<Employee> populateEmpRecords()
	{
		employeeList.add(new Employee(1012,"Narendra",90000));
		employeeList.add(new Employee(1024,"Amit",75000));
		employeeList.add(new Employee(1018,"Nitin",82000));
		employeeList.add(new Employee(1032,"Piyush",87000));				
		
		employeeList.add(new Employee(2020,"Nirmala",50000));
		employeeList.add(new Employee(2028,"Harsimrat",42000));
		employeeList.add(new Employee(2024,"Sushma",56000));
		employeeList.add(new Employee(2032,"Arun",67000));		
	
		employeeList.add(new Employee(3010,"Devendra",40000));
		employeeList.add(new Employee(3016,"Sudhir",31000));
		employeeList.add(new Employee(3022,"Pankaja",36000));
		employeeList.add(new Employee(3012,"Vinod",29000));		
		
	
		return employeeList;
	}
	
}
