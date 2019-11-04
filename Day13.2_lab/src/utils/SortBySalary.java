package utils;

import java.util.Comparator;

import com.app.core.Employee;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		
		return (int)(obj1.getEmpSal()-obj2.getEmpSal());
	}

}
