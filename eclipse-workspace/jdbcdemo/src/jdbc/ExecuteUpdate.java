package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {

		insertData("student",110, "'rishabh'", 26);
		updateData();
		deleteData();
		
		
	}	
		public static void insertData(String table,int id ,String name,int age) throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10", "root", "Vishnu1996@");
			
			Statement st = con.createStatement();
			
			st.executeUpdate("insert into "+table+" values("+id+","+name+","+age+")");
			System.out.println("insert into "+table+" values("+id+","+name+","+age+")");
		}
		
		public static void updateData() throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10", "root", "Vishnu1996@");
			
			Statement st = con.createStatement();
			
			st.executeUpdate("update student set name='shubhman' where id = 107");
			
			System.out.println("table is updated");
			
			
		}
		
		public static void deleteData()  throws ClassNotFoundException, SQLException
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10", "root", "Vishnu1996@");
			
			Statement st = con.createStatement();
			
			st.executeUpdate("delete from student where id = 108");
			
			System.out.println("Row deleted successfully");
			
			
			
		}
}

