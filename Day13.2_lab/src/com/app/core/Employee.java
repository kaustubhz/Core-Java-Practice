package com.app.core;



public class Employee {
	private int empId;
	private String empName;
	private double empSal;
//	private ArrayList<EmployeeAddress> addressList;
	
	public Employee(int empId, String empName, double empSal) {		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
//		this.addressList = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "\n Employee [Id=" + empId + ", Name=" + empName + ", Salary=" + empSal + "]";
	}

	@Override
	public boolean equals(Object objEmp) {
		// TODO Auto-generated method stub
		
		return this.empId==((Employee)objEmp).empId;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empId;
	}
	
	

}
