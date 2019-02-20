package com.cg.ems.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_master")

public class Product {
	@Id
	@Column(name="prod_code", length =10)
	private int productCode;
	@Column(name="prod_name", length =30)
	private String productName;
	@Column(name="prod_price", length =10)
	private int productPrice;
	
	@ManyToMany(mappedBy="productSet")
	Set<Supplier> supSet = new HashSet<Supplier>();
	
	
	public Product(int productCode, String productName, int productPrice, Set<Supplier> supSet) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.supSet = supSet;
	}
	public Product(int productCode, String productName, int productPrice) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Set<Supplier> getSupSet() {
		return supSet;
	}
	public void setSupSet(Set<Supplier> supSet) {
		this.supSet = supSet;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", supSet=" + supSet + "]";
	}
	
	}
	
	
	

