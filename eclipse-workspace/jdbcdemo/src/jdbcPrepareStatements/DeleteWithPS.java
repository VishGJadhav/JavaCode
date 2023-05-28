package jdbcPrepareStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteWithPS {

	public static void main(String[] args) throws ClassNotFoundException ,SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		
		Statement st = con.createStatement();
		
		PreparedStatement ps = con.prepareStatement("delete from student where id = ? ");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id: ");
		
		int id = sc.nextInt();
		ps.setInt(1, id);
		
		ps.execute();
		System.out.println("deleted!");
	
		
	}
}
