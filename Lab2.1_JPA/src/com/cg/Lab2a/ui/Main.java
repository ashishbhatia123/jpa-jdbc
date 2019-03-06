package com.cg.Lab2a.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.Lab2a.beans.Author;
import com.cg.Lab2a.service.AuthorServiceImpl;
import com.cg.Lab2a.service.IAuthorService;

public class Main {
public static void main(String[] args) {
	IAuthorService serviceObj =new AuthorServiceImpl();
	System.out.println("1.Insert into table\n 2.deleteById\n3.DeleteByWhereClause \n4. updateById\n"
			+ " 5.UpdatedByWhereClause \n 6.  fetch all details\n 7. find by id\n 8. exit");
	Scanner scanner = new Scanner(System.in);
	
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
		ArrayList<Author> listDelObj=serviceObj.deleteByWhereClause();
		for(Author au:listDelObj)
		{
		System.out.println(au);
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
	break;
	}
	case 8:
	{
	break;
	}
	}
	
	
	
}
	
	
}
