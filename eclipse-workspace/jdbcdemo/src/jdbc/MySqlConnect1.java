package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnect1 {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver Registered SuccessFully!");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307", "root","Vishnu1996@");
			
//			System.out.println("Connection Estabislished Successfully");
			
			Statement st = con.createStatement();
			
			st.execute("create database Employee ");
			System.out.println("Database created!");
			
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
