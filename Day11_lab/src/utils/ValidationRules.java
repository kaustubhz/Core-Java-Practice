package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import com.app.customer.AddressType;
import com.app.customer.Customer;
import com.app.customer.CustomerAddress;
import com.app.customer.CustomerType;

import cust_exceptions.CustomerHandlingException;

public class ValidationRules {
	private static SimpleDateFormat sdf;

	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

//	This converts string to date 
	public static Date convertToDate(String regDate) throws ParseException {
		return sdf.parse(regDate);
	}

//	This checks if proper card type has been inserted
	public static CustomerType validateCustomerType(String type) {
		return CustomerType.valueOf(type.toUpperCase());
	}

//	This validate if customer is present in list or not
	public static boolean isCustomerExist(String custEmail, HashMap<String, Customer> customerList)
			throws CustomerHandlingException {
		if (!customerList.containsKey(custEmail))
			throw new CustomerHandlingException("Customer not found");
		return true;
	}

//	To check if address type is proper or invalid
	public static AddressType validateAddressType(String address) {
		return AddressType.valueOf(address.toUpperCase());
	}

//	To check if address already exists
	public static boolean isAddressExists(String address, HashMap<String, CustomerAddress> addressList) {
		if (addressList.get(address) != null)
			return true;
		return false;
	}
}
