package com.cg.Lab2a.dao;

import java.util.ArrayList;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
	public ArrayList<Author> deleteByWhereClause() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author updateById(int authorId) {
		Author a1 =em.find(Author.class, authorId);
		a1.setName(new Name().setFirstName("ashish"));
		return null;
	}

	@Override
	public Author updateByWhereClause() {
		// TODO Auto-generated method stub
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
