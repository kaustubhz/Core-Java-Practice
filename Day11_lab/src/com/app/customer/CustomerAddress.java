package com.app.customer;

public class CustomerAddress {
	private String city, state, country, phoneNo;
	public AddressType addtype;

	public CustomerAddress(String city, String state, String country, String phoneNo, AddressType addtype) {
		this.city = city;
		this.state = state;
		this.country = country;
		this.phoneNo = phoneNo;
		this.addtype = addtype;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CustomerAddress objCustomerAddress=(CustomerAddress)obj;
		return city.equals(objCustomerAddress.city) && state.equals(objCustomerAddress.state) && country.equals(objCustomerAddress.country) && phoneNo.equals(objCustomerAddress.phoneNo) && addtype.equals(objCustomerAddress.addtype);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(phoneNo);
	}

	@Override
	public String toString() {
		return "CustomerAddress [city=" + city + ", state=" + state + ", country=" + country + ", phoneNo=" + phoneNo
				+ ", addtype=" + addtype + "]";
	}
	

	
}
