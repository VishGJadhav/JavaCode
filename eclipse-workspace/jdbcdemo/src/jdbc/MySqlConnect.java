package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnect {

	public static void main(String[] args) {
		
		try 
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver"); //--> url of jdbc Driver
			
			System.out.println("Driver Registered Successfully");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307", "root", "Vishnu1996@");
			
			//--> jdbc:mysql://localhost:3307  :- Url of database 
			System.out.println("Connection Estabilished SuccessFully");
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
