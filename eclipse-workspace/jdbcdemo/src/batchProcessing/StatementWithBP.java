package batchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementWithBP {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		
		Statement st = con.createStatement();
		
		st.addBatch("insert into student(ID,Name,age,cont) values(11,'Vivek',25,1234567890 )");
		st.addBatch("insert into student(id,name,age,cont) values(12,'Vaibhav',26,9673852021 )");
		st.addBatch("insert into student(id,name,age,cont) values(13,'Naresh',26,7038080542 )");
		st.addBatch("insert into student(id,name,age,cont) values(14,'Rushi',25,8080361025 ) ");
		st.executeBatch();
		System.out.println("Batch executed");
	}
}
