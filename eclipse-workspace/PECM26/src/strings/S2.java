package strings;

public class S2 {

	public static void main(String[] args) {
		
		String s1 = new String("Hi");
		String s2 = new String("Hi");
		
		System.out.println(s1.hashCode());    //2337
		System.out.println(s2.hashCode());    //2337
		
		System.out.println(s1==s2);			  // false
		
		// hashcode are same because of hashcode method is overridden 
		// but the object reference is not same because of they are unically created in heap area ........  
	}
}
