package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListPrevious {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		
		a1.add(5);
		a1.add(72);
		a1.add(78);
		a1.add(18);
		a1.add(45);
		a1.add(95);
		a1.add(3);
		
		ListIterator l1 = a1.listIterator(a1.size());
		
		while(l1.hasPrevious()) 
		{
			System.out.print(l1.previous()+",");
				
		}
		
 	}
}
