package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListItera {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		
		a1.add(10);
		a1.add(12);
		a1.add(9);
		a1.add(17);
		a1.add(52);
		
		ListIterator l1= a1.listIterator();
		
		while(l1.hasNext())
		{
			int num =(Integer)l1.next();
			
			if (num%2==0)
			{
				l1.remove();
			}
			
			
			
		}
		System.out.println(a1);
	}
}
