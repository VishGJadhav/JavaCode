package fundamentals;

import java.util.Scanner;

public class AdditionOfTwo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int num1 = s.nextInt();
		System.out.println("Enter a second number: ");
		int num2 = s.nextInt();
		
		int ans = num1 + num2 ;
		
		System.out.println("The addition of "+num1+" and "+num2+" is: "+ans);
		
	}
}
