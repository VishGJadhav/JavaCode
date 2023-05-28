package batchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementWithBP2 {

	public static void main(String[] args) throws Exception {
		
//		Insert
//		Insert
//		Update
//		Delete
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		
		Statement st = con.createStatement();
		st.addBatch("insert into student values(15,'Shubham',25,963852741)");
		st.addBatch("update student set cont = 9999999999 where id = 103");
		st.addBatch("delete from student where id = 15 ");
		st.executeBatch();
		System.out.println("Table Updated");
		
	}
}
