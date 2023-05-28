package strings;

import java.util.Scanner;

public class AlphabetCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		
		String ip = sc.nextLine().toLowerCase().trim();
		
		int [] count = new int [26] ;
		
		int index = 0 ;
		
		for (char i = 'a';i<'z' ;i++)
		{
			int ct = 0 ;
			
			for (int j = 0; j < ip.length(); j++)
			{
				char ch = ip.charAt(j);
				
				if (ch==i)
				{
					ct ++ ;
				}
				
				
			}
			count[index] = ct ;
			
			index++ ;
			
			
		}
		char ch = 'a';
		for (int i = 0; i < count.length; i++) 
		{
			if (count[i]!=0) 
			{
				System.out.println(ch+"---->"+count[i]);
			}
			ch++ ;
		}
	}
	
}
