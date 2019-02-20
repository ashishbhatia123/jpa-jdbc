
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelectEmpDemo {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // checked Exception 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Capgemini123");
			st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp1");
			System.out.println("ID \t \t NAME \t\t SALARY \t \t DOJI");
			while(rs.next())
			{
				
				System.out.println(rs.getInt("emp_id") +"\t\t"+ rs.getString("emp_name") +
						"\t\t"+ rs.getInt("emp_sal")+"\t\t"+ 
						rs.getDate("emp_doji"));
				
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
