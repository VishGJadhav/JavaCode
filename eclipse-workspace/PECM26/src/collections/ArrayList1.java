package collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList<>();
		a1.add("Vishnu");
		a1.add(15);
		a1.add(500);
		a1.add(true);
		a1.add(52);
		a1.add(52.25);
		a1.add(false);
		a1.add("Mahesh");
		a1.add("Yashpal");
		
		System.out.println(a1);
		a1.addAll(4, a1);
		System.out.println(a1);
		
		System.out.println(a1.size());
		
		
	}
}
