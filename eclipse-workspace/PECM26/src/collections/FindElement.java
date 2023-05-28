package collections;

import java.util.ArrayList;

public class FindElement {

	public static void main(String[] args) {
		
		ArrayList num = new ArrayList<>();
		
		num.add(15);
		num.add(25);
		num.add(46);
		num.add(120);
		num.add(220);
		num.add(325);
		
		if (num.contains(46))
		{
			System.out.println("Element found!");
		}
		else
		{
			System.out.println("Element Not Found!");
		}
		
		if (num.indexOf(46)<0)
		{
			System.out.println("Element Found!");
		}
		else
		{
			System.out.println("Element Not Found!");
		}
	}
}
