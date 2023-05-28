package jdbcPrepareStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ValidateTheData {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from account");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email: ");
		String email = sc.next();
		System.out.println("Enter the pass: ");
		String pass = sc.next();
		
		while(rs.next())
		{
			
			if (pass.equals(rs.getString(4)) && email.equals(rs.getString(3)))
			{
				System.out.println("Welcome to the bank of America");
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				return;
			}
			
		}
		System.out.println("Please Provide correct mail or pass");
	}
}
