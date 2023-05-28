package strings;

import java.util.Scanner;

public class WorsReverseFRomStringSentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String sentence: ");
		
		String ip = sc.nextLine().toLowerCase().trim();
		
		String [] words = ip.split(" ");
		
		String revwords ="";
		
		for (int i = 0; i < words.length; i++) 
		{
			revwords = revwords +reverse(words[i]);
		}
		
		System.out.println(revwords);
		
		
		
	}
	public static String reverse(String s)
	{
		String ans = "";
		
		for (int i = s.length()-1 ; i >= 0; i--) 
		{
			ans = ans +s.charAt(i);
		}
		
		return ans+" " ;
				
	}
}
