package com.app;
class Calculator
{
	private double firstNumber;
	private double secondNumber;
	
	public Calculator(double f,double s)
	{
		firstNumber=f;
		secondNumber=s;
	}
	
	public double getFirstNumber()
	{
		return firstNumber;
	}
	
	public void setFirstNumber(double num)
	{
		firstNumber=num;		
	}
	
	public void setSecondNumber(double num)
	{
		secondNumber=num;		
	}
	
	public double getSecondNumber()
	{
		return secondNumber;
	}
	
	public double add()
	{
		return (firstNumber + secondNumber);
	}
	
	public double subtract()
	{
		return (firstNumber - secondNumber);
	}
	
	public double multiply()
	{
		return (firstNumber * secondNumber);
	}
	
	public double division()
	{
		if(secondNumber==0)
		return 0;
		
		return (firstNumber / secondNumber);
	}
}