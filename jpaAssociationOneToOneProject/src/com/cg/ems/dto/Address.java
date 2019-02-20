package com.cg.ems.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Address {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="address_id", length =10)
	private int addressId;
	@Column(name ="street", length =25)
	private String street;
	@Column(name ="city", length =25)
	private String city;
	@Column(name ="zip_code", length =6)
	private String zipcode;
	@Column(name ="state", length =30)
	private String state;



	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", zipcode=" + zipcode
				+ ", state=" + state + "]";
	}



}
