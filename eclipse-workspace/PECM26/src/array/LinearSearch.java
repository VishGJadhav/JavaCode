package array;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the key: ");
		int key = s.nextInt();
		
		int [] a = {1,2,3,5,8,6,3,11,14,56};
		
		int i;
		for ( i = 0; i < a.length; i++)
		{
			if (a[i]== key)
			{
				System.out.println("Element found at "+i+" index");
				break;
			}
		}
		if (i==a.length)
		{
			System.out.println("Element Not Found!");
		}
	}

}
