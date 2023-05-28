package collections;

import java.util.ArrayList;

public class InsertAtFirstPosition {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		
		a1.add(10);
		a1.add(25);
		a1.add(35);
		a1.add(52);
		a1.add(45);
		
		System.out.println(a1);
		
		a1.add(0,5);
		System.out.println(a1);
		
		System.out.println(a1.get(2));
		
		a1.set(0, -15);
		System.out.println(a1);
		
		a1.remove(2);
		System.out.println(a1);
	}
}
