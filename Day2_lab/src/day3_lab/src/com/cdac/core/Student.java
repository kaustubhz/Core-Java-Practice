package com.cdac.core;

import java.util.Scanner;

public class Student
{
	private int studentID;
	private String studentName;
	private String studentEmail;
	private int studentAge;
	private double studentGPA;
	
	private static int staticID=1000; 
	
	public Student()
	{
		this.studentID=staticID;
		this.studentName="ABC";
		this.studentEmail="abc@gmail.com";
		this.studentAge=18;		
		this.studentGPA=0;
		staticID++;
	}
	public Student(String studentName,String studentEmail,int studentAge)
	{
		studentID=staticID;
		this.studentName=studentName;
		this.studentEmail=studentEmail;
		this.studentAge=studentAge;		
		staticID++;
	}
	
	public String getStudentDetails()
	{
		return " ID: "+studentID+" Name: "+studentName+" Email: "+studentEmail+
		" Age: "+studentAge+" GPA: "+studentGPA;
	}
	
	public void computeGPA()
	{		
		Scanner sc=new Scanner(System.in);
		
		int quizScore;
		int testScore;
		int assignmentScore;
		
		System.out.println("\n Enter Quiz score: ");
		quizScore=sc.nextInt();
		
		System.out.println("\n Enter Test score: ");
		testScore=sc.nextInt();
		
		System.out.println("\n Enter Assignment score: ");
		assignmentScore=sc.nextInt();
		
		studentGPA= (quizScore*0.20)+(testScore*0.50)+(assignmentScore*0.30);
		//return studentGPA;
	}
	
	public String getStudentName()
	{
		return ""+studentName;
	}
	
	public double getStudentGPA()
	{
		return studentGPA;
	}
	
	
}