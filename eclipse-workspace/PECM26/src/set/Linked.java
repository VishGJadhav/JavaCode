package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linked {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> h1 = new LinkedHashSet<>();
		
		h1.add(10);
		h1.add(12);
		h1.add(14);
		h1.add(16);
		h1.add(18);
		
		System.out.println(h1);
	}
}
