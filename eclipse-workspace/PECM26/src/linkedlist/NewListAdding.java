package linkedlist;

import java.util.LinkedList;

public class NewListAdding {

	public static void main(String[] args) {
		
		LinkedList<String> name = new LinkedList<>();
		
		name.add("Vishnu");
		name.add("Siddhesh");
		name.add("Yashpal");
		name.add("Roshan");
		name.add("Rohan");
		name.add("Yogesh");
		
		LinkedList<String> name2 = new LinkedList<>();
		name2.add("Mahesh");
		name2.add("Gorakh");
		name2.add("Navnath");
		
		name.addAll(0,name2);
		
		System.out.println(name);
		
		System.out.println("the first element: "+name.getFirst());
		System.out.println("The last element: "+name.getLast());
	}
}
