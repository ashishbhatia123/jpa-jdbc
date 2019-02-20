package com.cg.ems.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="roll_no", length =10)

	private int rollNo;
	@Column(name ="stu_name", length =25)
	private String studentName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="address_id")
	private Address stuAddress;



	public Student(int rollNo, String studentName, Address stuAddress) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.stuAddress = stuAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(Address stuAddress) {
		this.stuAddress = stuAddress;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", stuAddress=" + stuAddress + "]";
	}



}
