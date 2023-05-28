package set;

import java.util.ArrayList;
import java.util.HashSet;

public class HS1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(7);
		a1.add(4);
		a1.add(6);
		a1.add(100);
		a1.add(15);
		a1.add(15);
		
		System.out.println(a1);
		
		HashSet h1 = new HashSet(a1);
		System.out.println(h1);
		
		a1=new ArrayList<>(h1);
		System.out.println(a1);
	}
}
