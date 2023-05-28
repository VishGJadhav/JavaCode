package jdbcPrepareStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateValueWithPS {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		
	      PreparedStatement ps = con.prepareStatement("update student set  cont = ? where name = ?");
		
		  Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the naw age: ");
//		int age = sc.nextInt();
	
		System.out.println("enter the name: ");
		String name = sc.next();
		System.out.println("Enter the new contact: ");
		long cont = sc.nextLong();
//		ps.setInt(1, age);	
		ps.setLong(1, cont);
		ps.setString(2, name);
		
		System.out.println("Number of row updated: "+ps.executeUpdate());
		System.out.println("Value updated Successfully!");
		
		
		
	}
}
