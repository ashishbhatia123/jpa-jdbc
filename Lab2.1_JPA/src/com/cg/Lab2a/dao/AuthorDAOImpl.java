package com.cg.Lab2a.dao;

import java.util.ArrayList;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.Lab2a.beans.Author;
import com.cg.Lab2a.beans.Name;
import com.cg.Lab2a.service.IAuthorService;
import com.cg.Lab2a.util.JPAUtil;


public class AuthorDAOImpl implements IAuthorDAO{
	EntityManager em=JPAUtil.getEntiManager();
	
	EntityTransaction entityTran=em.getTransaction();
	
	@Override
	public Author  insert(Author authorObj) {
		
		entityTran.begin();
		em.persist(authorObj);
		entityTran.commit();
		
		return authorObj;
	}

	@Override
	public Author deleteById(int authorId) {
		Author a1 = em.find(Author.class, authorId);
		System.out.println(a1);
		entityTran.begin();
		em.remove(a1);
		entityTran.commit();
		return a1;
	}

	@Override
	public int deleteByWhereClause() {	
		Query query  =  em.createQuery("DELETE FROM Author a WHERE a.authorId = :no");
		// create query is applied on entity ie class parameter  
		//Query query = em.createNativeQuery("DELETE FROM author_master a WHERE a.auth_id = :no ");
		// createNative Query is applied on sql table		
		query.setParameter("no", 1);
		entityTran.begin();
		int deletedRowNumber = query.executeUpdate();
		entityTran.commit();
		
		return deletedRowNumber;
	}

	@Override
	public Author updateById(int authorId) {
		Author a1 =em.find(Author.class, authorId);
		a1.getName().setFirstName("ashish");
		return null;
	}

	@Override
	public Author updateByWhereClause() {
		
		
		Query query =em.createNativeQuery("UPDATE author_master a SET a.phone_no=:pNo WHERE a.auth_id=:no");
		query.setParameter("pNo", "1234567");
		query.setParameter("no", 1);
		entityTran.begin();
		int rowUpdatedNo= query.executeUpdate();
		entityTran.commit();
		System.out.println("updated");
		return null;
	}


	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Author> find(int author_id) {
		Query query = em.createQuery("SELECT a from Author AS a where a.authorId>:ID");
		query.setParameter("ID", author_id);
		entityTran.begin();
		//int noOfRows=query.executeUpdate();
		ArrayList<Author> list =(ArrayList<Author>) query.getResultList();
		entityTran.commit();
		
		//System.out.println("no of rows are :"+ noOfRows);
		return list;
	}

	@Override
	public ArrayList<Author> fetchAll() {
		System.out.println("asfg"+em);
		TypedQuery<Author> query= em.createQuery("select a from Author a", Author.class);
		ArrayList<Author> list= (ArrayList<Author>) query.getResultList();
		return list;
	}

}
