package fundamentals;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the start: ");
		int start = s.nextInt();
		System.out.println("Enter the end: ");
		int end = s.nextInt();
		
		while (start<=end) {
			if ((start%4==0 && start%100!=0)||(start%400==0)) 
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
