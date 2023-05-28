package strings;

public class S5 {

	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder("Qspiders");
		
		System.out.println(s1);
		
		System.out.println(s1.hashCode());
		
		 StringBuilder s2=s1.append("Jspiders");
		System.out.println(s2.hashCode());
		System.out.println(s1);
		
		StringBuilder s5 = new StringBuilder("Qspiders");
		System.out.println(s5.hashCode());
		
		StringBuilder s6 = s5.append("Vishnu");
		
		System.out.println(s6.hashCode());
		System.out.println(s6);
		
		System.out.println(s1.capacity());
		StringBuffer ss = new StringBuffer();
		System.out.println(ss.capacity());
		
		
		
		StringBuilder sb = new StringBuilder(100);
		System.out.println(sb.capacity());
		
		StringBuilder sb1 = new StringBuilder();
		
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
				
	}
}
