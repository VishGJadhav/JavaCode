package strings;

import java.util.Scanner;

public class TotalChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine().trim();
		String s2 = s1.replaceAll(" ", "");
		
		char[] s3 = s2.toCharArray();
		
		for (int i = 0; i < s3.length; i++) {
			System.out.print(s3[i]+" ");
		}
		 
	}
}
