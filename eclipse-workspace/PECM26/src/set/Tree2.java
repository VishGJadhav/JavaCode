package set;

import java.util.TreeSet;

public class Tree2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> t1 = new TreeSet<>();
		t1.add(10);
		t1.add(50);
		t1.add(40);
		t1.add(20);
		t1.add(30);
		
		System.out.println(t1);
		t1.add(100);
		System.out.println(t1);
		System.out.println(t1.pollFirst());
		System.out.println(t1.pollLast());
		
		System.out.println(t1.tailSet(50));
		
		
	}
}
