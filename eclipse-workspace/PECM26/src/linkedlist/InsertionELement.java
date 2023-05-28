package linkedlist;

import java.util.LinkedList;

public class InsertionELement {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<>();
		
		
		l1.add("Apple");
		l1.add("PineApple");
		l1.add("Chikoo");
		l1.add("Mango");
		l1.add("Graphs");
		
		System.out.println(l1);
		
		l1.add(3, "Anjeer" );
		System.out.println(l1);
		
		l1.addFirst("Stroberry");
		l1.addLast("Kiwi");
		
		System.out.println(l1);
	}
}
