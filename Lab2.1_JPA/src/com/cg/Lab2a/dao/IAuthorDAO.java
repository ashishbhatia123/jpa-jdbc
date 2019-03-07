package com.cg.Lab2a.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.Lab2a.beans.Author;

public interface IAuthorDAO {

	
		public abstract Author insert(Author authorObj);
		public abstract Author deleteById(int authorId);
		public abstract int deleteByWhereClause();
		public abstract Author updateById(int authorId);
		public abstract Author updateByWhereClause();
		public abstract Author find(int author_id);
		public abstract List<Author> fetchAll();
	}
