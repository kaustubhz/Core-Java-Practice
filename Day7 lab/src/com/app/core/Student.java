package com.app.core;

import java.util.Date;

public class Student {

	private String prn, name, email, course;
	private int marks;
	private Date dob;
	public String getPrn() {
		return prn;
	}

	

	public Student(String prn, String name, String email, String course, int marks,Date dob) {
		super();
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.course = course;
		this.marks = marks;
		this.dob=dob;
	}

	@Override
	public String toString() {
		return " Student [prn=" + prn + ", name=" + name + ", email=" + email + ", course=" + course + ", marks=" + marks
				+ ", DoB="+dob+"]";
	}

	@Override
	public boolean equals(Object s2) {
		if (s2 instanceof Student)
             return prn.equals(((Student)s2).prn);
		return false;
	}
}
