package jdbcPrepareStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateLoginCredential {

	public static void main(String[] args) throws ClassNotFoundException , SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		
		PreparedStatement ps = con.prepareStatement("insert into account values(?,?,?,?)");
//		st.execute("create table account(id int ,name varchar(15),email varchar(25), pass varchar(15))");
//		System.out.println("created");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		System.out.println("Enter the name: ");
		String name = sc.next();
		System.out.println("Enter the Email: ");
		String email = sc.next();
		System.out.println("Enter the pass: ");
		String pass = sc.next();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, pass);
		
		ps.execute();
		System.out.println("Value inserted!");
	}
}
