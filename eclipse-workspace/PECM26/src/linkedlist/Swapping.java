package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Swapping {

	public static void main(String[] args) {
		
		LinkedList<String> s1 = new LinkedList<>();
		s1.add("Vishnu");
		s1.add("Siddhesh");
		s1.add("Yashpal");
		
		Collections.swap(s1, 0, 1);
		System.out.println(s1);
	}
}
