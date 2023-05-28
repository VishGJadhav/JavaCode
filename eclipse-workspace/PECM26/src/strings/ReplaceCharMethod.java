package strings;

import java.util.Scanner;

public class ReplaceCharMethod {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String ip = s.nextLine();
		
		System.out.println("Enter old character to be relace: ");
		char old1 = s.next().charAt(0);
		System.out.println("Enter new character to replace: ");
		char new1 = s.next().charAt(0);
		
		String ans = toReplace(ip, old1, new1);
		
		System.out.println(ans);
		
	}
	
	public static String toReplace(String str,char old,char new1)
	{
		String newstr = "";
		
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i)==old) 
			{
				newstr = newstr + new1 ;
			}
			else
			{
				newstr = newstr + str.charAt(i);
			}
		}
		return newstr ;
	}
	
}
