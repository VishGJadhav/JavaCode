package strings;


import java.util.Arrays ;
import java.util.Scanner;

public class Anagram1 
 {

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first String:");
		char [] ch1 = s.next().toLowerCase().trim().toCharArray();
		System.out.println("Enter the second String: ");
		char [] ch2 = s.next().toLowerCase().trim().toCharArray();
		
		if (ch1.length==ch2.length) 
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			int i;
			for(i=0;i<ch2.length;i++)
			{
				if (ch1[i]!=ch2[i])
				{
					break ;
				}
			}
			
			if (i==ch1.length)
			{
				System.out.println("It is an Anagram");
			}
			else
			{
				System.out.println("Not an Anagram!");
			}	
		}
		else
		{
			System.out.println("Not an Anagram!");
		}
	}
	
}
