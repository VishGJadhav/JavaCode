package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class List1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(500);
		l1.add(235);
		l1.add(321);
		l1.add(391);
		l1.add(181);
		l1.add(138);
		l1.add(823);
		
		Iterator<Integer> i = l1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		Iterator<Integer> i1 = l1.descendingIterator();
		
		while(i1.hasNext())
		{
			System.out.print(i1.next()+" ");
		}
	}
}
