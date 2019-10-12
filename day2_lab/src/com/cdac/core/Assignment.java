package com.cdac.core;

public class Assignment
{
	public static void main(String[] args)
	{
		Tank objTank1=new Tank(10);
		Tank objTank2=new Tank(20);
		
		System.out.println("\n 1: Tank1.level: "+objTank1.getLevel());
		System.out.println("\n 1: Tank2.level: "+objTank2.getLevel());
		
		objTank1=objTank2;
		
		System.out.println("\n After assigning objTank1=objTank2");
		System.out.println("\n 2: Tank1.level: "+objTank1.getLevel());
		System.out.println("\n 2: Tank2.level: "+objTank2.getLevel());
		
		objTank1.setLevel(27);
		System.out.println("\n After assigning Tank1 to 27");
		System.out.println("\n 3: Tank1.level: "+objTank1.getLevel());
		System.out.println("\n 3: Tank2.level: "+objTank2.getLevel());
		
		objTank2.setLevel(objTank1.getLevel()+10);
		System.out.println("\n After incrementing Tank2 by 10");
		System.out.println("\n 4: Tank1.level: "+objTank1.getLevel());
		System.out.println("\n 4: Tank2.level: "+objTank2.getLevel());
				
	}
	
}