package collections;

import java.util.ArrayList;

public class Colours {

	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<>();
		
		color.add("Red");
		color.add("White");
		color.add("Black");
		color.add("Blue");
		color.add("Green");
		
		System.out.println(color);
		
		
		if (color.contains("Red"))
		{
			System.out.println("Element found!");
		}
		else
		{
			System.out.println("Element Not Found!");
		}
	}
}
