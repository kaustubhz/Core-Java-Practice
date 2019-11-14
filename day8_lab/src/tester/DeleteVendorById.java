package tester;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;

import static utils.HibernateUtils.*;

import java.util.Scanner;

public class DeleteVendorById {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in);SessionFactory sf=getSessionFactory()){
		System.out.println("Enter id of Vendor");
		VendorDaoImpl dao=new VendorDaoImpl();
		System.out.println(dao.deleteVendorDetails(new Integer(sc.nextInt())).equals("Success")?"\nVendor deleted":"No such vendor found");
	}catch(Exception e) {
		e.printStackTrace();
	}

	}

}
