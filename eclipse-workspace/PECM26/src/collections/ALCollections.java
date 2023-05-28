package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ALCollections {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(1);
		a1.add(51);
		a1.add(-5);
		a1.add(-15);
		
		System.out.println(a1);
		
		Collections.sort(a1);
		System.out.println(a1);
		
		Collections.shuffle(a1);
		System.out.println(a1);
		
		Collections.shuffle(a1);
		System.out.println(a1);
		
		Collections.reverse(a1);
		System.out.println(a1);
		
		
	}
}
