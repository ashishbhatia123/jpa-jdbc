package com.cg.Lab2a.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name {
	@Column(name="fname",length =15)
private String firstName;
	@Column(name="mname",length =15)
private String middleName;
	@Column(name="lname",length =15)
	private String LastName;
	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		LastName = lastName;
	}
	
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", LastName=" + LastName + "]";
	}




}
