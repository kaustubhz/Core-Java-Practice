package com.org;

public abstract class Employee {
	private int empId;
	private String empName;
	private String empEmail;
	private int deptId;
	private double basicSalary;
	private static int counter;
	
	static {
		counter=101;
	}
	public Employee(String name,String email,int dept,double basic)
	{
		this.empId=counter++;
		empName=name;
		empEmail=email;
		deptId=dept;
		basicSalary=basic;
	}
	@Override
	public String toString()
	{
		return " Emp ID: "+empId+" Name: "+empName+" Email: "+empEmail+" Dept: "+deptId+" Salary: "+basicSalary;
	}
	public double getBasicSalary()
	{
		return basicSalary;
	}
	
	public abstract double computeNetSalary();
	
	public int getEmpId() {
		return empId;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
}
