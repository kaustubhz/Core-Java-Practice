package com.app.core;

public class Student {
	private String prn,name,email,course;
	private double marks;
	
	public Student(String prn, String name, String email, String course, double marks) {

		this.prn = prn;
		this.name = name;
		this.email = email;
		this.course = course;
		this.marks = marks;
	}

	public String getPrn() {
		return prn;
	}

	@Override
	public String toString() {
		return "Student [ prn=" + prn + ", name=" + name + ", email=" + email + ", course=" + course + ", marks=" + marks
				+ " ]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Student)
			return this.prn.equals(((Student)o).prn);
		return false;
	}

}
