package collections;

import java.util.ArrayList;

public class Ar1 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add("Vishnu");
		a1.add(10);
		a1.add('V');
		a1.add(132.2234);
		a1.add(true);
		
		System.out.println(a1.indexOf(10));
		
		for (int i = 0; i < a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}
		
	
	}
}
