package collectionutils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.app.core.Employee;

public class EmployeeRecords {

	private static ArrayList<Employee> employeeList=new ArrayList<>();
	private static DateTimeFormatter dtf;
	
	static {
		dtf=DateTimeFormatter.ofPattern("d-M-y");				
	}
	
	public static ArrayList<Employee> populateEmpRecords() throws IllegalArgumentException
	{
		employeeList.add(new Employee(1012,"Narendra",90000,LocalDate.parse("16-05-2014", dtf)));
		employeeList.add(new Employee(1024,"Amit",75000,LocalDate.parse("10-07-2010", dtf)));
		employeeList.add(new Employee(1018,"Nitin",82000,LocalDate.parse("2-02-2012", dtf)));
		employeeList.add(new Employee(1032,"Piyush",87000,LocalDate.parse("9-04-2011", dtf)));				
		
		employeeList.add(new Employee(2020,"Nirmala",50000,LocalDate.parse("30-01-2009", dtf)));
		employeeList.add(new Employee(2028,"Harsimrat",42000,LocalDate.parse("19-03-2015", dtf)));
		employeeList.add(new Employee(2024,"Sushma",56000,LocalDate.parse("17-06-2013", dtf)));
		employeeList.add(new Employee(2032,"Arun",67000,LocalDate.parse("28-10-2016", dtf)));		
	
		employeeList.add(new Employee(3010,"Devendra",40000,LocalDate.parse("13-04-2017", dtf)));
		employeeList.add(new Employee(3016,"Sudhir",31000,LocalDate.parse("24-09-2013", dtf)));
		employeeList.add(new Employee(3022,"Pankaja",36000,LocalDate.parse("13-11-2012", dtf)));
		employeeList.add(new Employee(3012,"Vinod",29000,LocalDate.parse("7-08-2011", dtf)));		
		
	
		return employeeList;
	}
	
}
