package com.app;
import java.util.Scanner;


public class TestCalculator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		
		System.out.print("\nEnter first number: ");
		double firstNum=sc.nextDouble();
		System.out.print("\nEnter second number: ");
		double secondNum=sc.nextDouble();
		
		
		Calculator objCalculator=new Calculator(firstNum,secondNum);
		do
		{
		System.out.print("\n Menu");
		System.out.print("\n 1 : Add");
		System.out.print("\n 2 : Subtract");
		System.out.print("\n 3 : Multiply");
		System.out.print("\n 4 : Divide");
		System.out.print("\n 5 : Exit.");
		System.out.print("\n Enter your choice: ");
		choice=sc.nextInt();
		
			switch(choice)
			{
				case 1: System.out.print("\nAddition is: "+objCalculator.add());
				break;
				case 2: System.out.print("\nSubtraction is: "+objCalculator.subtract());
				break;
				case 3: System.out.print("\nMultiplication is: "+objCalculator.multiply());
				break;
				case 4: System.out.print("\nDivision is: "+objCalculator.division());
				break;
				case 5: System.out.println("\nEXITING");
				break;
				default: System.out.println("\nEnter valid choice");				
			}
		}while(choice!=5);
	}
}