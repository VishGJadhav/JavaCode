package strings;

public class StringPalindrom {

	public static void main(String[] args) 
	{
		String s1 = "jahaj";
		
		if (isPalindrom(s1)) {
			System.out.println("It is palindrom");
		}
		else
		{
			System.out.println("It is not Palindrom");
		}
	}
	
	public static boolean isPalindrom(String s)
	{
		int i = 0 ;
		int j = s.length()-1;
		
		while(i < j)
		{
			if (s.charAt(i)!=s.charAt(j))
			{
				return false ;
			}
			i++;
			j--;
		}
			
		return true ;
	}
}
