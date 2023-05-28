package fundamentals;

import java.util.Scanner;

public class MargeName {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the fisrt name: ");
		String fname = s.next();
		System.out.println("Enter the last name: ");
		String lname= s.next();
		
		System.out.println("The full Name is: "+fname+" "+lname);
	}
}
