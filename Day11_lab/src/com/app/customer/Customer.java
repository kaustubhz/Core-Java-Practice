package com.app.customer;

import java.util.Date;
import java.util.HashMap;

import cust_exceptions.CustomerHandlingException;
import static utils.ValidationRules.*;

public class Customer {
	private String customerEmail;
	private String customerPassword;
	private double regAmount;
	private Date regDate;
	public CustomerType customerType;
	private static HashMap<String,CustomerAddress> listAddress;

	public Customer(String customerEmail, String customerPassword, double regAmount, Date regDate,
			CustomerType customerType) {
		super();
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.regAmount = regAmount;
		this.regDate = regDate;
		this.customerType = customerType;
		listAddress=new HashMap<>();
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public static void linkAddress(String city, String state, String country, String phoneNo, AddressType addtype)
			throws CustomerHandlingException {
		if(isAddressExists(city, listAddress))
			throw new CustomerHandlingException("\n Address already exists");
		listAddress.put(city,new CustomerAddress(city, state, country, phoneNo, addtype));
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.customerEmail.equals(((Customer) obj).customerEmail);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 199;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Customer [ e-mail=" + customerEmail + ", Registered amount=" + regAmount + ", Registered Date="
				+ regDate + ", Customer type=" + customerType + ", Adress(es)=[ " + listAddress + " ]";
	}
}
