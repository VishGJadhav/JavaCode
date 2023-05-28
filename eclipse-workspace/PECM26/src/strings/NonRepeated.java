package strings;

public class NonRepeated {

	public static void main(String[] args) {
		
	String	s1 = "xyzpw";
	String 	s2 = "lmno" ;
	
	for (int i = 0; i < s1.length(); i++)
	{
		int count = 0 ;
		
		for (int j = 0; j < s2.length(); j++) 
		{
			if (s1.charAt(i)==s2.charAt(j)) 
			{
				count ++ ;
			}
			
		}
		if (count == 0) 
		{
			System.out.println(s1.charAt(i));
		}
	}
		
	}
}
