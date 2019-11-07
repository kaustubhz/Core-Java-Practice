package com.org;

public class Manager extends Employee{

	private int performanceBonus;
	
	public int getPerformanceBonus() {
		return performanceBonus;
	}

	public Manager(String mgrName,String mgrEmail,int mgrDept,double basicSal,int performanceBonus)
	{
				super(mgrName,mgrEmail,mgrDept,basicSal);
				this.performanceBonus=performanceBonus;
	}
	
	@Override
	public String toString()
	{
		System.out.println(super.toString());
		return " Performance Bonus: "+performanceBonus;
	}
	
	@Override
	public double computeNetSalary()
	{
		return super.getBasicSalary()+getPerformanceBonus();
	}
}
