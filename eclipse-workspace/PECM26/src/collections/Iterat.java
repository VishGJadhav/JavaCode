package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterat {

	public static void main(String[] args) {
		
		ArrayList<Object> l = new ArrayList<>();
		
		for (int i = 0; i <=10; i++) {
			l.add(i);
		}
		System.out.println(l);
		
		Iterator<Object> itr = l.iterator();
		
		while (itr.hasNext())
		{
			int i = (int)itr.next();
			
			if (i%2==0)
			{
				System.out.println(i);
			}
			else {
				itr.remove();
			}
			
		}
		System.out.println(l);
		
	}
}
