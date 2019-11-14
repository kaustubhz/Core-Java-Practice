package tester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static utils.HibernateUtils.*;
import org.hibernate.SessionFactory;
import dao.VendorDaoImpl;

import pojos.Vendor;

public class RegisterVendor {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);
				SessionFactory sf=getSessionFactory()){
			System.out.println("hibernate booted....");
			System.out.println("Enter Vendor details (name,email,password,city,phone,reg date (dd-MM-yyyy,reg amount):");
			Vendor objVendor=new Vendor(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd-MM-yyyy")),sc.nextDouble());
			VendorDaoImpl dao=new VendorDaoImpl();
			System.out.println(dao.registerVendor(objVendor));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
