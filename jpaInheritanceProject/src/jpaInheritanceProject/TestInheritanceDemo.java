package jpaInheritanceProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ems.util.JPAUtil;

public class TestInheritanceDemo {
	public static void main(String[] args) {
		
		Emp rahul = new Emp();  // new state
		rahul.setEmpName("Rahul chauhan");
		rahul.setEmpSal(60000);
		System.out.println(rahul);
		
		Manager Vaishali = new Manager();
		Vaishali.setEmpName("vaishalis");
		Vaishali.setEmpSal(50000);
		Vaishali.setDeptName("Java");
		
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tran = em.getTransaction();
		System.out.println(em);
		tran.begin();
		em.persist(rahul);
		em.persist(Vaishali);
		tran.commit();
		System.out.println("data is inserted");
		
		
		
		
	/*	
	Manager ee1= em.find(Manager.class, 37);
		System.out.println(ee1.getEmpName());
		*/
	}

}
