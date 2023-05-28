package jdbcPrepareStatements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginVAlidationWithPS {

		public static void main(String[] args) throws ClassNotFoundException,SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
			
			PreparedStatement ps = con.prepareStatement("select name from account where email = ? and pass = ? ");
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the email: ");
			String email = sc.next();
			ps.setString(1, email);
			System.out.println("Enter the pass: ");
			String pass = sc.next();
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
				
//			while(rs.next())
//			{
//				
//				if (email.equals(rs.getString(3)) && pass.equals(rs.getString(4)))
//				{
//					System.out.println("Welcome to the bank of America");
//					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
//					return;
//				}
//				
//			}	
//				System.out.println("Provide valid input");
			if (rs.next()) {
				
				System.out.println("Welcome "+rs.getString(1));
			}
			else
				{
				System.out.println("Provide valid input");
			}
		
			
		}
	}

