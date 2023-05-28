package collections;

import java.util.ArrayList;
import java.util.Vector;

public class AddingElement {

	public static void main(String[] args) {
		
		Vector v1 = new Vector<>();
		
		for (int i = 0; i < 10; i++) {
			
			v1.addElement(i);
		}
		
		System.out.println(v1.capacity());
		v1.addElement('A');
		System.out.println(v1.capacity());
		System.out.println(v1);
		
	}
}
