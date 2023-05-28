package batchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementWithBP3 {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		PreparedStatement ps = con.prepareStatement("insert into student(id,name,age,cont)values(?,?,?,?)");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <10; i++) 
		{
		
			System.out.println("Enter the id: ");
			int id = sc.nextInt();
			System.out.println("Enter the name: ");
			String name = sc.next();
			System.out.println("Enter the age: ");
			int age = sc.nextInt();
			System.out.println("Enter the ContactNumber: ");
			long cont = sc.nextLong();
		
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setLong(4, cont);
		
			ps.addBatch();
		
		}
		ps.executeBatch();
		System.out.println("Value inserted success!");

		
	}
	
	
}
