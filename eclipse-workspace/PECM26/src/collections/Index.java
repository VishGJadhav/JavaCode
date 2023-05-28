package collections;

import java.util.ArrayList;

public class Index {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList<>();
		
		a1.add(10);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(20);
		a1.add(6,0);
		
		a1.set(4, "Vishnu");
		System.out.println(a1);
		
//		 int  a2=a1.size();
//		
//		System.out.println(a2);
	}
}
