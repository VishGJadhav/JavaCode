package strings;

import java.util.Scanner;

public class RemoveEven {

	public static String removeEven(String str)
	{
		String ans ="";
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (ch%2!=0) 
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
		String result = removeEven(ip);
		
		System.out.println(result);
	}
}
