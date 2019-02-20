package com.cg.ems.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdate {
public static void main(String[] args) {
	Connection con;
	try {
		con = DBUtil.getCon();
		String updateQry = "UPDATE emp1 SET EMP_NAME = 'ashish' WHERE emp_sal>30000";  // dynamic query
		//String updateQry = "UPDATE emp1 SET EMP_NAME = ? WHERE emp_sal>30000";  // dynamic query
		PreparedStatement pst = con.prepareStatement(updateQry);
	//	pst.setString(1, "anuradha");
		System.out.println("bjhgj");
		int data = pst.executeUpdate();
		
		System.out.println("DATA IS updated"+ data);
	} catch (SQLException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
