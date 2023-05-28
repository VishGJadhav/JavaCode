package collections;

import java.util.ArrayList;

public class Marging {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("Apple");
		a1.add("Mango");
		a1.add("PineApple");
		a1.add("Banana");
		a1.add("Graphes");
		
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList<>();
		
		a2.add("Potato");
		a2.add("Tomato");
		a2.add("Root");
		a2.add("Carrot");
		a2.add("Beetroot");
		
		System.out.println(a2);
		
		a1.addAll(0,a2); 		// adding with index
		
		System.out.println(a1);
				
		
	}
}
