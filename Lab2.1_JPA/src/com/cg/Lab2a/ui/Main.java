package com.cg.Lab2a.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.Lab2a.beans.Author;
import com.cg.Lab2a.service.AuthorServiceImpl;
import com.cg.Lab2a.service.IAuthorService;

public class Main {
public static void main(String[] args) {
	IAuthorService serviceObj =new AuthorServiceImpl();
	
	Scanner scanner = new Scanner(System.in);
	
	
	while(true)
	{
		System.out.println("1.Insert into table\n 2.deleteById\n3.DeleteByWhereClause \n4. updateById\n"
				+ " 5.UpdatedByWhereClause \n 6.  fetch all details\n 7. find by id\n 8. exit");
		System.out.println("Enter choice");
		int choice = scanner.nextInt();
	switch(choice)
	{
	case 1:
	{
		
		//--------inserted-----------
		System.out.println("Enter Author ID");
		int auth_Id= scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter first Name");
		String fname= scanner.nextLine();
		
	System.out.println("Enter middle name ");
	String mname = scanner.nextLine();
	
	System.out.println("Enter last name ");
	String lname = scanner.nextLine();
	
	System.out.println("Enter phoneNo ");
	String phoneNo = scanner.nextLine();
		Author authorObj= serviceObj.insert(auth_Id,fname,mname,lname,phoneNo);
		System.out.println(authorObj);			
		System.out.println("data inserted");
	break;
	}
	case 2:
	{
		//--- deletebyId---
		Author listDelObj=serviceObj.deleteById(1);
		if(listDelObj!=null)
		{
		System.out.println(listDelObj);
		System.out.println("row is deleted");
	}
		else
			System.out.println("row  canont find with id= 1");
		
	break;
	}
	case 3:
	{//--- deletebyWhereClause---
		int delObj=serviceObj.deleteByWhereClause();
		if(delObj!=0)
		{
			System.out.println("Deleted rows are "+ delObj);
		}
		
	break;
	}
	case 4:
	{
		//--updatedById--
		serviceObj.updateById(1);
	break;
	}
	case 5:
	{
		//---- udate by where clause
		serviceObj.updateByWhereClause();
	break;
	}
	case 6:
	{
		ArrayList<Author> listObj=serviceObj.fetchAll();
		for(Author l1:listObj)
		{
			System.out.println(l1);
		}
	break;
	}
	case 7:
	{
		//----findById---
		ArrayList<Author> list=serviceObj.find(2);
		System.out.println("no of rows are :"+list.size());
		for(Author auth:list)
		{
			System.out.println(list);
		}
		
		
		
	break;
	}
	case 8:
	{
		System.exit(0);
	break;
	}
	}
	
}
	
}
	
	
}
