package com.cg.ems.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "dept_master")

public class Department {
	@Id
	@Column(name="dept_code",length= 10)
	private int deptCode;
	
	@Column(name="dept_name",length= 25)
	private String deptName;
	
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="empDept") // as here we use mappedBy so it is a slave  
	private Set<Employee> empSet= new HashSet<Employee>();
	

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptCode, String deptName) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
	}

	public int getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

	public Set<Employee> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(Set<Employee> salesEmpSet) {
		this.empSet = salesEmpSet;
	}

	@Override
	public String toString() {
		return "Department [deptCode=" + deptCode + ", deptName=" + deptName + "]";
	}
	
	

}
