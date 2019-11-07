package com.org;

public class Worker extends Employee {
	private int hoursWorked;
	private double hourlyRate;
	
	public Worker(String name, String email, int dept, double basic,int hours,double rate) {
		super(name, email, dept, basic);
		hoursWorked=hours;
		hourlyRate=rate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Worker [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + "]";
	}
	
	@Override
	public double computeNetSalary()
	{
		return (getHoursWorked()*getHourlyRate()+super.getBasicSalary());
	}
	
	
	
	

}
