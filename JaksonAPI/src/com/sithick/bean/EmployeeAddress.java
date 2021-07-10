package com.sithick.bean;

public class EmployeeAddress {
	
	private String addressLine1;
	private String addressLine2;
	private String city;
	private int pincode;
	private String state;
	
	public EmployeeAddress() {
	}

	public EmployeeAddress(String addressLine1, String addressLine2, String city, int pincode, String state) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return String.format("EmployeeAddress [addressLine1=%s, addressLine2=%s, city=%s, pincode=%s, state=%s]",
				addressLine1, addressLine2, city, pincode, state);
	}
	
	

}
