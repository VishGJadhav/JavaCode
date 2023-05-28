package cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(31);
		a1.add(40);
		a1.add(51);
		a1.add(60);
		a1.add(70);
		
		Iterator<Integer> it = a1.iterator();
		
		while (it.hasNext())
		{
			Integer i = (Integer)it.next();
			
			if (i%2==0)
			{
				System.out.println(i);
			}
			
			else {
				it.remove();
			}
		}
		
		System.out.println(a1);
		
		
	}
}
