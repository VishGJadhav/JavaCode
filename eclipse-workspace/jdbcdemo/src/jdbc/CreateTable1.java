package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Vishnu1996@");
		
		Statement st = c1.createStatement();
		
//		st.execute("insert into student values(101,'Vish',26),(102,'Yash',25)");
		
		st.execute("insert into student values(103,'Sidh',26),(105,'Sanket',24),(106,'Mukul',25), (107,'Pashya',26),(108,'Akash',26)");
		
		
		System.out.println("Value Inserted");
		
	}
}
