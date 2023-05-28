package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffling {

	public static void main(String[] args) {
		
		ArrayList s1 = new ArrayList<>();
		
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("D");
		s1.add("E");
		
		System.out.println("Before Shuffling: "+s1);
		Collections.shuffle(s1);
		System.out.println("After Shuffling: "+s1);
	}
}
