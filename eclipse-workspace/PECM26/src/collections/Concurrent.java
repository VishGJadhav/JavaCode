package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Concurrent {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> i1 = list.iterator();
		
		while(i1.hasNext())
		{
			Integer num = i1.next();
			
			if (num.equals(30))
			{
				list.remove(num);  //concurrentModificationException
			}
		}
		System.out.println(list);
	}
}
