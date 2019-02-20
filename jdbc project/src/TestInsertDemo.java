import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.ems.util.DBUtil;

public class TestInsertDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empid");
		int eid = sc.nextInt();
		System.out.println("enter ename");
		sc.nextLine();
		String enm = sc.nextLine();
		System.out.println("Enter salary");
		float esal=  sc.nextFloat();
		
		try {
			Connection con =DBUtil.getCon();
			
			String insertQry = "INSERT INTO emp1 " + "(emp_id,emp_name , emp_sal)" + "values (?,?,?)"; // dynamic query
			PreparedStatement pst = con.prepareStatement(insertQry);
			pst.setInt(1, eid);
			pst.setString(2, enm);
			pst.setFloat(3, esal);
			int data = pst.executeUpdate();
			System.out.println("DATA IS INSERTED"+ data);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();

}
}
