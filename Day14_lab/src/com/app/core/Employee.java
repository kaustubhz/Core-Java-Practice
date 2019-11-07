package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int empId;
	private String empName;
	private double empSal;
	private LocalDate hireDate;
	
	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public Employee(int empId, String empName, double empSal,LocalDate hireDate) {		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.hireDate=hireDate;
//		this.addressList = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "\n Employee [ ID = " + empId + ", Name = " + empName + ", Salary = " + empSal + ", Joining Date = " + hireDate
				+ " ]";
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

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	

}
