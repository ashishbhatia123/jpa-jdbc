package com.cg.ems.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ems.util.JPAUtil;

public class TestManyToManyDemo {
	public static void main(String[] args) {
		EntityManager em= JPAUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p1 = new Product();
		p1.setProductCode(100);
		p1.setProductName("Tv");
		p1.setProductPrice(35000);


		Product p2 = new Product();
		p2.setProductCode(200);
		p2.setProductName("Refrigrator");
		p2.setProductPrice(56000);


		Product p3 = new Product();
		p3.setProductCode(300);
		p3.setProductName("CD");
		p3.setProductPrice(200);


		Product p4 = new Product();
		p4.setProductCode(400);
		p4.setProductName("Laptop Bags");
		p4.setProductPrice(4500);

		
		
		Set<Product> elecProSet = new HashSet<Product>();
		elecProSet.add(p1);
		elecProSet.add(p2);
		elecProSet.add(p3);
		
		
		
		

		Supplier sony = new Supplier();
		sony.setSupplierId(111);
		sony.setSupplyDate(new Date()); // current date or system date
		sony.setProductSet(elecProSet);

		Supplier lg = new Supplier();
		lg.setSupplierId(222);
		lg.setSupplyDate(new Date(2018,12,04)); 
		
		
		Set<Supplier> suppSet = new HashSet<Supplier>();
		suppSet.add(sony);
		suppSet.add(lg);
		
		
		p1.setSupSet(suppSet);
		//p4.setSupSet(suppSet);
		
		et.begin();
		em.persist(sony);
		et.commit();
		
		System.out.println("product is persisted");
		

		
		
		


	}
}

