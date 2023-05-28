package set;

import java.util.TreeSet;

public class Tree1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> t1 = new TreeSet<>();
		t1.add(10);
		t1.add(15);
		t1.add(5);
		t1.add(6);
		t1.add(2);
		t1.add(-5);
		
		System.out.println(t1);
		
		System.out.println(t1.pollFirst());
		System.out.println(t1.pollLast());
		
	}
}
