package strings;

import java.util.Scanner;

public class ToUpper {

	public static String toUpper(String ip)
	{
		String ans = "";
		
		for (int i = 0; i < ip.length(); i++) 
		{
		
			char ch = ip.charAt(i);
			if (ch>='a' && ch<='z')
			{
				ans = ans+(char)(ch-32);
			}
			else
			{
				ans = ans + ch ;
			}
		}
		return ans ;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String ip = sc.next();
		
		String ans = toUpper(ip);
		
		System.out.println(ans);
	}
}
