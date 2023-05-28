package strings;

import java.util.Scanner;

public class Repeaed {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String ip = sc.next();
		
		String [] str = new String [ip.length()];
		
		for (int i = 0; i < str.length; i++) 
		{
			char ch1 = ip.charAt(i);
			
			String ans = "" ;
			
			for (int j = i; j < str.length; j++)
			{
				
				char ch2  = ip.charAt(j);
				
				if (ch1==ch2)
				{
					ans = ans + ch1 ;
				}
				else 
				{
					break;
				}
			}
			str[i] = ans ;
		}
		int max = 0 ;
		
		for (int i = 0; i < str.length; i++) 
		{
			
			if (str[i].length()>max)
			{
				max = str[i].length();
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			
			if (max == str[i].length()) {
				
				System.out.println(str[i]);
			}
		}
	}
}
