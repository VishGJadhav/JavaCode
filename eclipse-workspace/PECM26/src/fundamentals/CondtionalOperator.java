package fundamentals;

import java.util.Scanner;

public class CondtionalOperator {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a first number: ");
		int num1 = s.nextInt();
		System.out.println("Enter a second Number: ");
		int num2 = s.nextInt();
		
		int ans = num1 > num2 ? num1 : num2;
		
		System.out.println(ans);
	}

}
