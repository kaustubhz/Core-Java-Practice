package com.cdac.core;

public class Customer
{
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	public Customer()
	{
		name="Rama";
		email="rama@gmail.com";
		age=25;
		creditLimit=10000;
	}
	
	public Customer(String n,String e,int a,double cL)
	{
		name=n;
		email=e;
		age=a;
		creditLimit=cL;
	}
	
	public Customer(String n,String e,int a)
	{
		this(n,e,a,15000);
	}
	
	public String getDetails()
	{
		return "Customer name: "+name+" Credit Limit: "+creditLimit+"";
	}
	
	public void setCreditLimit(double d)
	{
		creditLimit=d;
	}
	
	public double getCreditLimit()
	{
		return creditLimit;
	}
}