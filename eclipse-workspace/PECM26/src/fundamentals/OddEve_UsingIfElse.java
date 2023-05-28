package fundamentals;

import java.util.Scanner;

public class OddEve_UsingIfElse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = s.nextInt();
		
		if (num%2==0) {
			System.out.println("it is Even number");
		}
		else {
			System.out.println("It is odd number");
		}
				
	}

}
