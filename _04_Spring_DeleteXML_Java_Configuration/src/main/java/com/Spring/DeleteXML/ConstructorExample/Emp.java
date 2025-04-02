package com.Spring.DeleteXML.ConstructorExample;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	
     public Emp(Address address) {
		super();
		this.address = address;
	}

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address.getCity() + "]";
	}
     
     
}
