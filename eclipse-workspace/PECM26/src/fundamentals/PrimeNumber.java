package fundamentals;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		
		int den;
		for (den=2;den<num;den++)
		{
			if (num % den == 0) {
				break;
			}
		}
		if (num==den) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}
}
