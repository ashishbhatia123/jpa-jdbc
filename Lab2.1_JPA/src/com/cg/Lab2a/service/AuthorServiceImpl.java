package com.cg.Lab2a.service;


import java.util.ArrayList;
import java.util.List;

import com.cg.Lab2a.beans.Author;
import com.cg.Lab2a.beans.Name;
import com.cg.Lab2a.dao.AuthorDAOImpl;
import com.cg.Lab2a.dao.IAuthorDAO;



public class AuthorServiceImpl implements IAuthorService{
Author authorObj ;
IAuthorDAO daoObj= new AuthorDAOImpl();
	@Override
	public Author insert(int author_Id, String fname,String mname,String lname,String phoneNo) {
		authorObj = new Author(author_Id,new Name(fname,mname,lname),phoneNo);
		
		return daoObj.insert(authorObj) ;
	}

	@Override
	public Author deleteById(int authorId) {
		
		return daoObj.deleteById(authorId);
	}

	@Override
	public int deleteByWhereClause() {
		
		return daoObj.deleteByWhereClause();
	}

	@Override
	public Author updateById(int authorId) {
		
		return daoObj.updateById(authorId);
	}

	@Override
	public Author updateByWhereClause() {
		// TODO Auto-generated method stub
		return daoObj.updateByWhereClause();
	}

	@Override
	public ArrayList<Author> find(int author_id) {
		// TODO Auto-generated method stub
		return  daoObj.find(author_id);
	}

	@Override
	public ArrayList<Author> fetchAll() {
		// TODO Auto-generated method stub
		return (ArrayList<Author>) daoObj.fetchAll();
	}

	

	
}
