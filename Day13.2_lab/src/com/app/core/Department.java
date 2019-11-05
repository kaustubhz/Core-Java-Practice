package com.app.core;

import java.io.Serializable;
import java.util.ArrayList;

public class Department implements Serializable {
	private int deptID;
	private String deptName;
	private ArrayList<Employee> employeeList;
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}
	
	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(int deptID, String deptName, ArrayList<Employee> employeeList) {	
		this.deptID = deptID;
		this.deptName = deptName;
		this.employeeList=new ArrayList<>();
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "\n Department [ID=" + deptID + ", Name=" + deptName + ", Employee List=" + employeeList + "]";
	}

	@Override
	public int hashCode() {
		return this.deptID;
	}

	@Override
	public boolean equals(Object obj) {		
		Department other = (Department) obj;
		return deptID == other.deptID;			
		
	}
	
	
}
