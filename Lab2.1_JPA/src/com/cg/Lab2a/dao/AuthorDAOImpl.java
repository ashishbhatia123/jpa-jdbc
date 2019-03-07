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
		em.flush();
		em.clear();
		Query query = em.createNativeQuery("DELETE  FROM Author AS a WHERE a.authorId = :no ");
		
		query.setParameter("no", 5);
		int deletedRowNumber = query.executeUpdate();
		
		
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
		
		
		Query query =em.createQuery("update Author a SET a.phoneNo=:pNo where a.authorId=:no");
		query.setParameter("pNo", "1234567");
		query.setParameter("no", 5);
		int rowUpdatedNo= query.executeUpdate();
		System.out.println("updated");
		return null;
	}

	@Override
	public Author find(int author_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Author> fetchAll() {
		System.out.println("asfg"+em);
		TypedQuery<Author> query= em.createQuery("select a from Author a", Author.class);
		ArrayList<Author> list= (ArrayList<Author>) query.getResultList();
		return list;
	}

}
