package fundamentals;

import java.util.Scanner;

public class MultipleTable {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		System.out.println("The multiplication table of "+num+" is: ");
		
		int n1 = 1 ;
		while (n1<=10) {
			System.out.println(num+"*"+n1+"="+(num*n1));
			n1++;
		}
	}
}
