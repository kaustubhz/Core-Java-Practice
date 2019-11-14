package tester;

import static utils.HibernateUtils.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;
import pojos.Vendor;

public class GetVendorByCityAndDate {

	public static void main(String[] args) {

		System.out.println("\n Inside GetVendorByCityAndDate");
		try(Scanner sc=new Scanner(System.in);SessionFactory sessionFactory=getSessionFactory()){
			VendorDaoImpl obj=new VendorDaoImpl();
			System.out.println("\n Enter city and date (for eg.1-1-2000)");
			List<Vendor> vendors=obj.getSelectedVendors(sc.next(), LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			if(!vendors.isEmpty())
			{
				System.out.println("\n Vendors are: \n"+vendors);
			}
			else
			{
				System.out.println("No record(s) found");
			}
		}
		catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
