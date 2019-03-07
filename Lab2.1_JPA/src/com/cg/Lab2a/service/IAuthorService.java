package com.cg.Lab2a.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

import com.cg.Lab2a.beans.Author;

public interface IAuthorService {
public abstract Author insert(int author_Id, String fname,String mname,String lname,String phoneNo);
public abstract Author deleteById(int authorId);
public abstract int deleteByWhereClause();
public abstract Author updateById(int authorId);
public abstract Author updateByWhereClause();
public abstract ArrayList<Author> find(int author_id);
public abstract ArrayList<Author> fetchAll();
	
	
}
