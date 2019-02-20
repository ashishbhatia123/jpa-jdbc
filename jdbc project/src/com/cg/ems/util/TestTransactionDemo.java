package com.cg.ems.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransactionDemo {
public static void main(String[] args) {
	Connection con =null;
	try {
		 con = DBUtil.getCon();
		con.setAutoCommit(false);
		String update1 = "update emp1 set emp_name = 'vaishali'  where emp_id =111"; 
		String update2 = "update emp1 set emp_sal = 30000  where emp_id =112"; 
		Statement st = con.createStatement();
		st.addBatch(update1);
		st.addBatch(update2);
		int arr[]= st.executeBatch();
		con.commit();
		System.out.println("updated success");
	} catch (SQLException | IOException e) {
		// TODO Auto-generated catch block
		try {
			con.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.printStackTrace();
	}
}
}
