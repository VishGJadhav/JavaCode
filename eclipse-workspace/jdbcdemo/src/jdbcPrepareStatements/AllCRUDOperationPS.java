package jdbcPrepareStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AllCRUDOperationPS {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "Vishnu1996@");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation You want: ");
		System.out.println("1.create the table-");
		System.out.println("2.Read/fetch the data-");
		System.out.println("3.update the value-");
		System.out.println("4.delete value from table-");
		int op = sc.nextInt();
		
		switch (op) {
		case 1:
		{
			System.out.println("You can create only Three column in the table!");
			System.out.println("Enter the Table Name:");
			String tableName = sc.next();
			
			System.out.println("Enter the First Column Name:");
			String col1 = sc.next();
			System.out.println("Enter the datetype of first: ");
			String datatype1 =sc.next();
			
			System.out.println("Enter the second column Name:");
			String col2 = sc.next();
			System.out.println("Enter the datetype of Second: ");
			String datatype2 =sc.next();
			
			System.out.println("Enter the Third column Name: ");
			String col3 = sc.next();
			System.out.println("Enter the datetype of Third: ");
			String datatype3 =sc.next();
			
			Statement st = con.createStatement();
			st.execute("create table "+tableName+""+col1+" "+datatype1+","+col2+datatype2+","+col3+datatype3+"");
			System.out.println("Table Created");
			
			break;
		}

		default:
			break;
		}
		
	}
}
