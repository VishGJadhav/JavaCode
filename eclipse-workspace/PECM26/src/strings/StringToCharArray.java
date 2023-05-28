package strings;

public class StringToCharArray {

	public static char[] stringToCharArray(String str)
	{
		char [] ch = new char[str.length()];
		
		
		for (int i = 0; i < ch.length; i++) 
		{
			ch[i] = str.charAt(i);
		}
		
		return ch ;
		
	}
	public static void main(String[] args)
	{
		char [] ans = stringToCharArray("Vishnukant");
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
		
	}
}
