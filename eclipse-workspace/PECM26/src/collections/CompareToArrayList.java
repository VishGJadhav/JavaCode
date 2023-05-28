package collections;

import java.util.ArrayList;

public class CompareToArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> s1 = new ArrayList<>();
		
		s1.add("Red");
		s1.add("White");
		s1.add("Blue");
		s1.add("Black");
		s1.add("Orange");
		s1.add("Green");
		
		ArrayList<String> s2 = new ArrayList<>();
		
		s2.add("Red");
		s2.add("White");
		s2.add("Blue");
		s2.add("Orange");
		s2.add("Green");
		
		
		ArrayList<String> s3 = new ArrayList<>();
		
		for (String e : s1)
		{
			if (s2.contains(e))
			{
				s3.add(e);
			}
			else
			{
				System.out.println(e+" Not Present ");
			}
		}
		
		System.out.println(s3);
		
		
		
		
	}
}
