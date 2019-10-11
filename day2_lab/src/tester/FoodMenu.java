package tester;
import java.util.Scanner;

class FoodMenu
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		int quantity=0;
		int price;
		int billAmount=0;
		boolean exit=false;
		while(exit!=true)
		{
		System.out.println("\nMenu");
		System.out.println("1.Dosa\tPrice: Rs.30");
		System.out.println("2.Samosa\tPrice: Rs.10");
		System.out.println("3.Sandwich\tPrice: Rs.20");
		System.out.println("4.Burger\tPrice: Rs.50");
		System.out.println("5.Vada Pav\tPrice: Rs.10");
		System.out.println("6.Pizza \tPrice: Rs.200");
		System.out.println("7.Idli \tPrice: Rs.20");
		System.out.println("8.Bhel \tPrice: Rs.20");
		System.out.println("9.Chaat \tPrice: Rs.30");
		System.out.println("10.Generate Bill");
		System.out.println("Enter your choice and qty ");
		choice=sc.nextInt();
		if(choice!=10)
		quantity=sc.nextInt();
		switch(choice)
		{
			case 1: {
						price=30;
						billAmount+=(quantity*price);
					}
					break;
			case 2:{
						price=10;
						billAmount+=(quantity*price);
					}
					break;
			case 3:{
						price=20;
						billAmount+=(quantity*price);
					}
					break;
			case 4:{
						price=50;
						billAmount+=(quantity*price);
					}
					break;
			case 5:{
						price=10;
						billAmount+=(quantity*price);
					}
					break;
			case 6:{
						price=200;
						billAmount+=(quantity*price);
					}
					break;
			case 7:{
						price=20;
						billAmount+=(quantity*price);
					}
					break;
			case 8:{
						price=20;
						billAmount+=(quantity*price);
					}
					break;
			case 9:{
						price=30;
						billAmount+=(quantity*price);
					}
					break;
			case 10:{
						System.out.println("Your Total Bill is "+billAmount);
						exit=true;
					}
					break;
			default: System.out.println("Please Enter a valid choice");
		}
		}
	}
}