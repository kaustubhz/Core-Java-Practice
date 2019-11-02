package tester;

import static utils.CollectionUtils.*;
import java.util.HashMap;
import java.util.Scanner;

import com.app.customer.Customer;
import static utils.ValidationRules.*;

public class TestCustomer {

	public static void main(String[] args) {
			HashMap<String,Customer> customerList=populateRecords();
//			System.out.println(customerList);
			try(Scanner sc=new Scanner(System.in))
			{
		
				System.out.println("\n Enter address\nCity State Country Phone Number Address Type (Home/Work/Other)");
				String city=sc.next();
				Customer.linkAddress(city, sc.next(), sc.next(), sc.next(), validateAddressType(sc.next()));
				System.out.println(customerList);
//				if(isCustomerExist(custEmail, customerList))
//				{
//					System.out.println("Customer found ");
////					(customerList.v(custEmail)).
//				}
//				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}
}
