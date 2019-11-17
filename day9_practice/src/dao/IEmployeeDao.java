package dao;

import java.util.List;

import pojos.Employee;

public interface IEmployeeDao {
	String hireEmp(int deptId,Employee e);
	List<Employee> listEmps(String deptName);
	String fireEmp(int deptId,int empId);
}
