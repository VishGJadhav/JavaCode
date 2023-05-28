package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArralist {

	public static void main(String[] args) {
		
		ArrayList s1 = new ArrayList<>();
		
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("D");
		s1.add("E");
		
		System.out.println(s1);
		ArrayList  s2 = new ArrayList<>();
		s2.add("1");
		s2.add("2");
		s2.add("3");
		s2.add("4");
		s2.add("5");
		System.out.println(s2);
		
		Collections.copy(s2, s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	
	}
}
