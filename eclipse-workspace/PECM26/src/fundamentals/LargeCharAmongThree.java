package fundamentals;

import java.util.Scanner;

public class LargeCharAmongThree {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a first char: ");
		char c1 =s.next().charAt(0);
		System.out.println("Enter a second char: ");
		char c2 = s.next().charAt(0);
		System.out.println("Enter a third char: ");
		char c3 = s.next().charAt(0);
		
		char large = c1 > c2 ? c1 : c2 ;
		
		char big = large > c3 ? large : c3 ;
		
		System.out.println(big);
	}
}
