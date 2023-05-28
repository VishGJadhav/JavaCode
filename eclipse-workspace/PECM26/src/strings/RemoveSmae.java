package strings;

public class RemoveSmae {

	public static void main(String[] args) {
		
		String s1 = "abcdef";
		String s2 = "cefz";
		
		for (int i = 0; i < s1.length(); i++) 
		{
			char c1 = s1.charAt(i);
			
			for (int j = 0; j < s2.length(); j++) 
			{
				char c2 = s2.charAt(j);
				
				if (c1==c2 ) 
				{
					s1 = remove(s1, c2);
					break;
				}
			}
		}
		System.out.print(s1);
	}
	public static String remove(String s,char c)
	{
		int count = 0 ;
		
		String ans = "";
		for (int i = 0; i < s.length(); i++) 
		{
			char c1 = s.charAt(i);
			if (c1==c && count==0)
			{
				if (i==s.length()) 
				{
					ans = ans ;
				}
				else
				{
					ans = ans +s.charAt(++i);
				}
				count++;
			}
			else
			{
				ans = ans + c1 ;
			}
		}
		return ans ;
	}
}
