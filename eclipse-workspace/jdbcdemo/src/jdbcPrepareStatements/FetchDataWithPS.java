package jdbcPrepareStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FetchDataWithPS {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		
		Statement st = con.createStatement();
		
		PreparedStatement ps = con.prepareStatement("select * from student where id = ? ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		System.out.println("id "+" name"+"  Age "+"ContactNumber       "   );
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4));
		
		
	}
}
