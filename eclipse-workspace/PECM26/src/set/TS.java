package set;

import java.util.ArrayList;
import java.util.TreeSet;

public class TS {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<>();
		
		a1.add(25);
		a1.add(2);
		a1.add(11);
		a1.add(47);
		a1.add(-12);
		a1.add(17);
		a1.add(3);
		
		System.out.println(a1);
		
		TreeSet<Integer> t1 = new TreeSet<>(a1);
		
		System.out.println(t1);
		
		for (int i : t1)
		{
			System.out.println(i);
		}
	}
}
