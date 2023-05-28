package jdbcPrepareStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValuesUsingPS {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the tableName: ");
		 String tableName = sc.next();
		       PreparedStatement ps = con.prepareStatement("insert into "+tableName+" (id,name,age,cont) values(?,?,?,?) ");
		       
		      for (int i = 0; i < 1; i++)
		      {
				
		    	 
			       System.out.println("Enter the id: ");
			       int id = sc.nextInt();
			       System.out.println("Enter the name: ");
			       String name = sc.next();
			       System.out.println("Enter the age: ");
			       int age = sc.nextInt();
			       System.out.println("Enter the contact Number: ");
			       long cont = sc.nextLong();
			       
			       ps.setInt(1, id);
			       ps.setString(2, name);
			       ps.setInt(3, age);
			       ps.setLong(4, cont);
			       
			       ps.execute();
			}
		       
		       System.out.println("Value are inserted successfully!!!");
		       
		 
	}
}
