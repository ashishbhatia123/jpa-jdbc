package com.cg.ems.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ems.util.JPAUtil;

public class TestOneToOneDemo {
public static void main(String[] args) {
	EntityManager em= JPAUtil.getEntityManager();
	EntityTransaction et = em.getTransaction();
			Address vAddress = new Address();
	vAddress.setCity("pune");
	vAddress.setState("Maharashtra");
	vAddress.setStreet("Sinhad Road");
	vAddress.setZipcode("411041");
	
	Address rAddress = new Address();
	rAddress.setCity("Gaziabad");
	rAddress.setState("Up");
	rAddress.setStreet("GT Road");
	rAddress.setZipcode("200731");
	
	Student vinita = new Student();
	vinita.setStudentName("Vinita Lalwani");
	vinita.setStuAddress(vAddress);
	
	Student rahul = new Student();
	rahul.setStudentName("Rahul Sharma");
	rahul.setStuAddress(rAddress);
	
	et.begin();
	em.persist(vinita);
	em.persist(rahul);
	et.commit();
	System.out.println("Data is inserted in the table");
	
	System.out.println("-----Fetch----------");
	
	/*Address ad = em.find((Address.class, 26);
			System.out.println(ad);
	et.begin();
	em.remove(ad);
	et.commit();*/
}
}
