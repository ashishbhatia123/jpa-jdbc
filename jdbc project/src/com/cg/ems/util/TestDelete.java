package com.cg.ems.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDelete {
public static void main(String[] args) {
	try {
		Connection con =DBUtil.getCon();
		String deleteQry = "DELETE FROM emp1 WHERE emp_sal =5000";  // dynamic query
		PreparedStatement pst = con.prepareStatement(deleteQry);
		int data = pst.executeUpdate();
		System.out.println("DATA IS deleted"+ data);
	} catch (SQLException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
