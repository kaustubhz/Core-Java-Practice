package tester;

import java.util.Scanner;

import thread2.EvenNumberThread;
import thread2.OddNumberThread;

public class TestEvenOddUsingThreadRunnable {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		int num1,num2;
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter first number and second number:");
			num1=sc.nextInt();
			num2=sc.nextInt();
						
			EvenNumberThread objEvenNumberThread=new EvenNumberThread(num1,num2);
			
			OddNumberThread objOddNumberThread=new OddNumberThread(num1,num2);
			
			/* System.out.print("\n Enter thread name:"); */
			Thread evenThread=new Thread(objEvenNumberThread,"even");
			/* System.out.print("\n Enter thread name:"); */
			Thread oddThread=new Thread(objOddNumberThread,"odd");
			
			evenThread.start();
			oddThread.start();
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		 
		
		System.out.println(Thread.currentThread().getName()+" finished");
	}

}
