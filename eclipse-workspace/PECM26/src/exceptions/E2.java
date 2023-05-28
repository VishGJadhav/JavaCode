package exceptions;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		System.out.println("Enter the first Number: ");
		int n1 = s.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = s.nextInt() ;
		
		int res = n1/n2 ;
		
		System.out.println(res);
				
	}
}
