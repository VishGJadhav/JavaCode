package batchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatementWithBP {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		PreparedStatement ps = con.prepareStatement("insert into student(id,name,age,cont)values(1010,'Shubham',45,9999999999)");
		ps.addBatch();
		ps.addBatch();
		ps.addBatch();
		ps.executeBatch();
		System.out.println("Values inserted sucess");
	}
}
