package array;

import java.util.Scanner;

public class RepeatedElemnet {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the key: ");
		int key = s.nextInt();
		
		int [] a = {1,5,8,3,45,25,65,39,25};
		
		int count = 0;
		int i ;
		
		for ( i = 0; i < a.length; i++) 
		{
			if (a[i]==key) 
			{
				count++ ;
			}
		}
		if (count == 0) {
			System.out.println("No Element Found");
		}
		else {
			System.out.println(key+" repeated of "+count+" times");
		}
	}
}
