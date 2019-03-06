package com.cg.Lab2a.beans;
import javax.persistence.Column;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Author_master")
public class Author {
@Id
@Column(name="auth_id")
	private int authorId;
@Embedded
	private Name Name;
@Column(name="phone_no",length =10)
	private String phoneNo;
public int getAuthorId() {
	return authorId;
}
public void setAuthorId(int authorId) {
	this.authorId = authorId;
}
public Name getName() {
	return Name;
}
public void setName(Name Name) {
	this.Name = Name;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public Author(int authorId, Name Name, String phoneNo) {
	super();
	this.authorId = authorId;
	this.Name = Name;
	this.phoneNo = phoneNo;
}

public Author() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Author [authorId=" + authorId + ", Name=" + Name + ", phoneNo=" + phoneNo + "]";
}
	
	


	
	
	
}
