package strings;

public class MaxRepeatedChar {

	public static void main(String[] args) {
		
		String s1 = "my name is mamma diya mansoon";
		
		int [] freq = new int[s1.length()];
		
		char [] ch = s1.toCharArray();
		
		int count = 1 ;
		
		for (int i = 0; i < s1.length(); i++) {
				char c1 = s1.charAt(i);
			
			for (int j = i+1; j < s1.length(); j++) 
			{
				char c2 = s1.charAt(i);
				if (c1==c2)
				{
					count ++;
					
				}
			}
		}
	}
}
