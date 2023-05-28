package strings;

public class ReverseGivenString {

	public static void main(String[] args)
	{
		String s = "Vishnukant";
		
		for (int i = s.length()-1; i >= 0 ; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}
