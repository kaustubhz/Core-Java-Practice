package tester;

import static utils.HibernateUtils.getSessionFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;
import pojos.Vendor;

public class GetVendorById {

	public static void main(String[] args) {
		System.out.println("In all GetVendorById");
		try(Scanner sc=new Scanner(System.in);SessionFactory sessionFactory=getSessionFactory()){
			VendorDaoImpl vendorDaoImpl=new VendorDaoImpl();	
			System.out.println("Enter vendor id you want to get: ");
			Vendor vendor= vendorDaoImpl.getDetails(sc.nextInt());
			if(vendor != null)
				System.out.println("\n Vendor is\n"+vendor);
			else
				System.out.println("No such vendor is found");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
