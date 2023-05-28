package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcBasic {

	public static void main(String[] args) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver registered SuccessFully!");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307", "root", "Vishnu1996@");
			System.out.println("Connection estabilish successfully");
			con.close();
			
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
