package strings;

public class ReplaceNumber {

	public static void main(String[] args) {
		
		String s1 = number("10210101010");
		System.out.println(s1);
		
		
	}
	public static String number(String str)
	{
		String ans = "";
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch!=0) 
			{
				ans = ans + ch ;
			}
			else if (ch==0) 
			{
				continue ;
			}
			
		}
		return ans ;
	}
}
