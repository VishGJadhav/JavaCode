package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10", "root", "Vishnu1996@");
		
		Statement st = con.createStatement();
		
		ResultSet val = st.executeQuery("select * from student ");
		
		while (val.next()) {
			System.out.println("====================");
			System.out.println(val.getInt(1)+" "+val.getString(2)+"    "+val.getInt(3));
			
			
		}
		
	}
}
																																																																																																																																																																																																																