package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		
		a1.add(10);
		a1.add(500);
		a1.add(100);
		a1.add(52);
		a1.add(-5);
		a1.add(65);
		a1.add(02154);
		
		System.out.println("Original Arralist: "+ a1);
		
		Collections.sort(a1);
		System.out.println("Sorted Arralist: "+a1);
		
	}
}
