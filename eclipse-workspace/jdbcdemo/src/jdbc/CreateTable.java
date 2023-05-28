package jdbc;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee","root","Vishnu1996@");
		
		Statement st = c1.createStatement();
		
//		st.execute("create table Emp(id int,name Varchar(20),age int,company varchar(15),job varchar(15))");
		
//		st.execute("insert into emp values(101,'Vishnukant',26,'TCS','Testing')");
//		st.execute("insert into emp values(102,'Yashpal',25,'Infosys','Developer')");
//		st.execute("insert into emp values(103,'Siddhesh',26,'Cambrio','Tester')");
//		st.execute("insert into emp values(103,'Prashant',25,'Capg','Developer')");
//		st.execute("insert into emp values(105,'Rushikesh',25,'Mahindra','Support')");
//		st.execute("insert into emp values(106,'Juned',25,'Test Yantra','Developer')");
//		st.execute("insert into emp values(107,'Sanket',25,'Test Yantra','BA')");
//		st.execute("insert into emp values(108,'Vishwa',24,'Test Yantra','Developer')");
		
//		st.execute("update emp set id=104 where name='prashant'");
//		st.execute("delete from emp where id = 105");
//		System.out.println("Value Inserted! And one Row Update");
		
		st.execute("alter table emp modify id int Primary Key");
		
		System.out.println("cgygceqyilgwegfcweegfcyiwr");
		
		
		
		
		
		
	}
}
