package collections;

import java.util.ArrayList;

public class IterateList {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Red");
		a1.add("Blue");
		a1.add("Black");
		a1.add("White");
		a1.add("Green");
		
		System.out.println(a1.get(2));
		
		System.out.println("==============");
		for (String string : a1) 
		{
			System.out.println(string);
		}
		
	}
}
