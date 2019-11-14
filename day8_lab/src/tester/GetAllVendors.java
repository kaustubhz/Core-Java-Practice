package tester;

import static utils.HibernateUtils.*;

import java.util.List;

import pojos.*;
import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;

public class GetAllVendors {

	public static void main(String[] args) {
		System.out.println("In all Vendor list");
		try(SessionFactory sessionFactory=getSessionFactory()){
			VendorDaoImpl vendorDaoImpl=new VendorDaoImpl();			
			List<Vendor> allVendors= vendorDaoImpl.getAllVendors();
			System.out.println("\n All vendors are\n"+allVendors);
			
		}

	}

}
