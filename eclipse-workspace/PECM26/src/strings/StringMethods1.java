package strings;

public class StringMethods1 {

	public static void main(String[] args) {
		
		String s1 = " Vishnukant " ;
		System.out.println("Original String "+s1);
		
		System.out.println("charAt "+s1.charAt(10));
	//	System.out.println(s1.codePointAt(5));
		System.err.println("CompareTo "+s1.compareTo("vis"));
		System.out.println("Concat "+s1.concat(" Jadhav"));
		System.out.println("isEmpty "+s1.isEmpty());
		System.out.println("Length() "+s1.length());
		System.out.println("replace "+s1.replace('a', '@'));
		System.out.println("replaceAll "+s1.replaceAll(s1, "Madhupriya"));
		
		String [] ans = s1.split("u");
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println("split "+ans[i]);
		}
		System.out.println("substring "+s1.substring(7));
		System.out.println("substring "+s1.substring(3, 8));
		
		char [] ans2 = s1.toCharArray();
		for (int i = 0; i < ans2.length; i++) {
			System.out.print(ans2[i]+",");
		}
		System.out.println();
		
		System.out.println("trim() "+s1.trim());
		System.out.println("valueOf Boolean "+s1.valueOf(true));
		System.out.println("valueOf char "+s1.valueOf(s1));
		
				 
	}
}
