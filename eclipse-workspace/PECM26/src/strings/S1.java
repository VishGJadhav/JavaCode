package strings;

public class S1 {

	public static void main(String[] args) {
		
		String s1 = "Qspiders" ;
		String s2 = "Jspiders" ;
		String s3 = "Qspiders" ;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}
