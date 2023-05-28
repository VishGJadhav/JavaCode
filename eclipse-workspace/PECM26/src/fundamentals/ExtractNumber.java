package fundamentals;

import java.util.Scanner;

public class ExtractNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		
		while (num!=0) {
			int rem = num % 10;
			System.out.println(rem);
			num = num / 10 ;
		}
	}
}
