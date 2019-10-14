package tester;
import com.cdac.core.Customer;
import java.util.Scanner;


class TestCustomer
{
	public static void main(String[] args)
	{
		Customer objCustomer1=new Customer();
		System.out.println("Default values for customer1 are: "+objCustomer1.getDetails());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name,email,age and credit limit for customer 2: ");
		Customer objCustomer2=new Customer(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
		System.out.println("Customer details are: "+objCustomer2.getDetails());
		
		System.out.println("Enter customer name,email,age and for customer 3: ");
		Customer objCustomer3=new Customer(sc.next(),sc.next(),sc.nextInt());
		System.out.println("Customer details are: "+objCustomer3.getDetails());
		System.out.println("Customer1 details with old credit limit: "+objCustomer1.getDetails());
		objCustomer1.setCreditLimit(objCustomer1.getCreditLimit()+1000);
		System.out.println("Customer1 details with new credit limit: "+objCustomer1.getDetails());
		
	}
}