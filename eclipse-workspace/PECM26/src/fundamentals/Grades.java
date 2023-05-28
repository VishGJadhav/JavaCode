package fundamentals;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a mark: ");
		int mark = s.nextInt();
		
		if (mark<35) {
			System.out.println("FAIL");
		}
		else if (mark==35) {
			System.out.println("PASS");
		}
		else if (mark>35 && mark<60) {
			System.out.println("Average");
		}
		else if (mark>=75 && mark<100) {
			System.out.println("Distinction");
		}
	}
}
