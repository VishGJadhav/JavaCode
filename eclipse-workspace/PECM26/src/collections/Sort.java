package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(7);
		a1.add(15);
		a1.add(-2);
		a1.add(1);
		
		Collections.sort(a1);		
		/* collections.sort() method will internally call compare To();
		 * for comparing the element like bubble sort
		 * if (ele1> ele2) return 1; and swap 
		 * if(ele1<ele2) return -1 ; no swapping here...........
		 */
		System.out.println(a1);
	}
}
