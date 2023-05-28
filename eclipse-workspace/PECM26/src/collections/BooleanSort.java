package collections;

import java.util.ArrayList;
import java.util.Collections;

public class BooleanSort {

	public static void main(String[] args) {
		
		ArrayList<Boolean> a1 = new ArrayList<>();
		
		a1.add(true);
		a1.add(false);
		a1.add(true);
		a1.add(true);
		a1.add(false);
		
		Collections.sort(a1);
		System.out.println(a1);
	}
}
