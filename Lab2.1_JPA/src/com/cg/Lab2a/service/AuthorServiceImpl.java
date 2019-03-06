package com.cg.Lab2a.service;


import java.util.ArrayList;

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
	public ArrayList<Author> deleteByWhereClause() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author updateById(int authorId) {
		
		return daoObj.updateById(authorId);
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
		// TODO Auto-generated method stub
		return (ArrayList<Author>) daoObj.fetchAll();
	}

	

	
}
