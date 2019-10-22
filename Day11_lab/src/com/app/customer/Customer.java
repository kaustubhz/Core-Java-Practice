package com.app.customer;

import java.util.ArrayList;
import java.util.Date;

import cust_exceptions.CustomerHandlingException;

public class Customer {
	private String customerEmail;
	private String customerPassword;
	private double regAmount;
	private Date regDate;
	public CustomerType customerType;
	private ArrayList<CustomerAddress> listAddress = new ArrayList<CustomerAddress>();

	public Customer(String customerEmail, String customerPassword, double regAmount, Date regDate,
			CustomerType customerType) {
		super();
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.regAmount = regAmount;
		this.regDate = regDate;
		this.customerType = customerType;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void linkAddress(String city, String state, String country, String phoneNo, AddressType addtype)
			throws CustomerHandlingException {
		/*
		 * if(listAddress.isEmpty()) listAddress.add(new CustomerAddress(city, state,
		 * country, phoneNo, addtype));
		 */
		if (listAddress.contains(new CustomerAddress(city, state, country, phoneNo, addtype))) {
			throw new CustomerHandlingException("Address already exists");
		}
		listAddress.add(new CustomerAddress(city, state, country, phoneNo, addtype));
		System.out.println("\n New address linked successfully");
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.customerEmail.equals(((Customer) obj).customerEmail);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Customer [ e-mail=" + customerEmail + ", Registered amount=" + regAmount + ", Registered Date="
				+ regDate + ", Customer type=" + customerType + ", Adress(es)=[ " + listAddress + " ]";
	}
}
