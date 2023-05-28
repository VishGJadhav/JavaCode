package collections;

import java.util.Stack;

public class Stackss {

	public static void main(String[] args) {
		
		Stack sy = new Stack();
		
		sy.push("Vishnu");
		sy.push("Yash");
		sy.push("Sidd");
		sy.push("Vish");
		
		System.out.println(sy.search("Vishnu"));
		
	}
}
