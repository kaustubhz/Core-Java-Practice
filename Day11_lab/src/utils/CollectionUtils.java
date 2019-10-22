package utils;

import java.text.SimpleDateFormat;
import java.util.HashMap;

import com.app.customer.*;

public class CollectionUtils {

	private static HashMap<String, Customer> customers = new HashMap<>();

	private static SimpleDateFormat sdf;

	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public static HashMap<String, Customer> populateRecords() {
		try {
			System.out.println("\n Generating record(s)");

			customers.put("anay@gmail.com", new Customer("anay@gmail.com", "anay1234", 15600, sdf.parse("11-02-2013"),
					CustomerType.valueOf("GOLD")));
			customers.put("ankit@gmail.com", new Customer("ankit@gmail.com", "ankit1248", 25000,
					sdf.parse("24-08-2012"), CustomerType.valueOf("PLATINUM")));
			customers.put("ameya@gmail.com", new Customer("ameya@gmail.com", "ameya3432", 10600,
					sdf.parse("19-02-2018"), CustomerType.valueOf("SILVER")));
			customers.put("anuj@gmail.com", new Customer("anuj@gmail.com", "auj1214", 41600, sdf.parse("04-02-2011"),
					CustomerType.valueOf("PLATINUM")));
			customers.put("anuja@gmail.com", new Customer("anuja@gmail.com", "anuja1334", 19600,
					sdf.parse("23-04-2015"), CustomerType.valueOf("GOLD")));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return customers;
	}
	

}
