package linkedlist;

import java.util.LinkedList;

public class ElementAndPosition {

	public static void main(String[] args) {
		
		LinkedList<String> col = new LinkedList<>();
		
		col.add("Red");
		col.add("Green");
		col.add("Yellow");;
		col.add("White");
		col.add("Blue");
		col.add("Black");
		col.add("Orange");
		
		col.remove(4);
		
		System.out.println("Index"+" Name");
		for (int i = 0; i < col.size(); i++) {
			System.out.println(i+"     "+col.get(i));
		}
	}
}
