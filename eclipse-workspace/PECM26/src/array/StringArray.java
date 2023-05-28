package array;

public class StringArray
{
	public static void main(String[] args) {
		String [] s = new String [5]; 
		s[0] = "INDIA";
		s[1] = "UNITED STATE OF AMERICA";
		s[2] = "UNITED KINGDOM";
		s[3] = "RUSSIA";
		s[4] = "AUSTRELIA";
		
		/*System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);*/
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}
}
