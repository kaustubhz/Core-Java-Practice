package com.app.core;

import java.util.ArrayList;

public class Department {
	private int deptID;
	private String deptName;
	private ArrayList<Employee> departmentList;
	
	public Department(int deptID, String deptName, ArrayList<Employee> departmentList) {	
		this.deptID = deptID;
		this.deptName = deptName;
		this.departmentList=new ArrayList<>();
		this.departmentList = departmentList;
	}
	
	
}
