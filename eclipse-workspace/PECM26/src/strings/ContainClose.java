package strings;

import java.util.Scanner;

public class ContainClose {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter main String: ");
		String main = sc.next();
		
		System.out.println("Enter the subString: ");
		String sub = sc.nextLine().toLowerCase().trim();
		
		char [] ch1 = main.toCharArray();
		
		int subcount = sub.length();
		
		char search = sub.charAt(0);
		
		int i;
		 
		for ( i = 0; i < ch1.length; i++) 
		{
			
			if (search == ch1[i]) 
			{
				int j,k=i;
				
				for(j=0;j<subcount;j++,k++)
				{
					if (ch1[k]!=sub.charAt(j))
					{
						break;
					}
				}
				
				if (j==subcount)
				{
					System.out.println("Substring found!");
					break;
				}
			}
		}
		
		if (i==ch1.length)
		{
			System.out.println("Substring Not found!");
		}
	}
	
}
