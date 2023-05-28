package strings;

import java.util.Scanner;

public class OnlyFirstCharUpper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String s1 = sc.nextLine();
		
		String ans = "" ;
		
		for (int i = 0; i < s1.length(); i++) {
			
			char ch = s1.charAt(i) ;
			if (i==0)
			{
				char c1 = s1.charAt(i);
				String c2 = String.valueOf(c1);
				 c2 =c2.toUpperCase();
				
				ans = ans + c2 ;
			}
			else if (ch==32)
			{
				char c1 = s1.charAt(++i);
				String c2 = String.valueOf(c1);
				 c2 =c2.toUpperCase();
				
				ans = ans + ch + c2 ;
			}
			else 
			{
				ans = ans + ch ;
			}
			
		}
		System.out.println(ans);
	}
}
