package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddingColumn {

public static void main(String[] args)throws ClassNotFoundException , SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root","Vishnu1996@");
		
		Statement st = con.createStatement();
		st.execute("alter table account add cont long");
		System.out.println("column Added");
	}
}
