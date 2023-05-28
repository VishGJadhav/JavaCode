package set;

import java.util.ArrayList;
import java.util.TreeSet;

public class TS1 {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("Vishnu");
		a1.add("Mahesh");
		a1.add("Ajay");
		a1.add("Kala");
		a1.add("Jeet");
		a1.add("Xylum");
		
		System.out.println(a1);
		
		TreeSet<String > t1 = new TreeSet<>(a1);
		
		System.out.println(t1);
		
		a1=new ArrayList<>(t1);
		
		System.out.println(a1);
		
//		a1.remove(3);
		System.out.println(a1.get(3)+" is removed");
		
				
		
		
	}
}
