package tester;

import java.util.Scanner;

import thread1.EvenNumberThread;
import thread1.OddNumberThread;

public class TestEvenOddUsingThreadExtends {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		int num1,num2;
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter first number and second number:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			System.out.print("\n Enter thread name:");
			EvenNumberThread objEvenNumberThread=new EvenNumberThread(num1,num2, sc.next());
			
			System.out.print("\n Enter thread name:");
			OddNumberThread objOddNumberThread=new OddNumberThread(num1,num2, sc.next());
			
			objEvenNumberThread.start();
			objOddNumberThread.start();
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		 
		
		System.out.println(Thread.currentThread().getName()+" finished");
	}

}
