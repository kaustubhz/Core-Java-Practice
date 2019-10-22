package tester;

import static utils.CollectionUtils.*;
import static utils.ValidationRules.*;
import java.util.HashMap;
import java.util.Scanner;

import com.app.customer.Customer;

public class TestCustomer {

	public static void main(String[] args) {
			HashMap<String,Customer> customerList=populateRecords();
//			System.out.println(customerList);
			try(Scanner sc=new Scanner(System.in))
			{
			/*
			 * System.out.
			 * println("\n Enter customer\'s record\n Email Password Amount Date Type");
			 * String custEmail=sc.next(); customerList.put(custEmail,new
			 * Customer(custEmail,sc.next(),sc.nextDouble(),convertToDate(sc.next()),
			 * validateCustomerType(sc.next()))); System.out.println(customerList);
			 */
				System.out.println("\n Linking address");
				System.out.println("\n Enter email");
				String custEmail=sc.next();
				if(isCustomerExist(custEmail, customerList))
				{
					System.out.println("Customer found ");
//					(customerList.v(custEmail)).
				}
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}
}
