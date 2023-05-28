package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> s1 = new ArrayList<>();
		
		s1.add("Vishnu");
		s1.add("Siddhesh");
		s1.add("Yashpal");
		s1.add("Sanket");
		s1.add("Prashant");
		
		System.out.println("Before Reversing: "+s1);
		
		Collections.reverse(s1);
		System.out.println("After Reversing: "+s1);
		
		
		
		System.out.println(s1.subList(0, 3));
		
		
	}
}
