package tester;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;

import static utils.HibernateUtils.*;

import java.util.Scanner;

public class UpdateVendorDetails {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in);SessionFactory sf=getSessionFactory()){
		System.out.println("Enter id of Vendor and new city and new phoneNo: ");
		VendorDaoImpl dao=new VendorDaoImpl();
		System.out.println(dao.updateVendorDetails(sc.nextInt(),sc.next(),sc.next()));
	}catch(Exception e) {
		e.printStackTrace();
	}

	}

}
