package linkedlist;

import java.util.LinkedList;

public class Adding {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		
		System.out.println(l1);
		
//		for (int i = 0; i < l1.size(); i++)
//		{
//				System.out.println(l1.get(i));
//		}
		
		for (Integer i : l1)
		{
			System.out.println(i);
		}
	}
}
