package jdbcPrepareStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAllValues {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery("select * from student");
	    
	    System.out.println("id | name | age |cont");
	    System.out.println("----------------------------");
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1)+"| "+rs.getString(2)+"| "+rs.getInt(3)+" |"+rs.getLong(4));
	    }
	}
}
