package com.app.core;



public class EmployeeAddress {
	private String city, state, country, phoneNo;
	public AddressType addtype;

	public EmployeeAddress(String city, String state, String country, String phoneNo, AddressType addtype) {
		this.city = city;
		this.state = state;
		this.country = country;
		this.phoneNo = phoneNo;
		this.addtype = addtype;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		EmployeeAddress objEmployeeAddress=(EmployeeAddress)obj;
		return city.equals(objEmployeeAddress.city) && state.equals(objEmployeeAddress.state) && country.equals(objEmployeeAddress.country) && phoneNo.equals(objEmployeeAddress.phoneNo) && addtype.equals(objEmployeeAddress.addtype);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(phoneNo);
	}

	@Override
	public String toString() {
		return "EmployeeAddress [city=" + city + ", state=" + state + ", country=" + country + ", phoneNo=" + phoneNo
				+ ", addtype=" + addtype + "]";
	}
}
