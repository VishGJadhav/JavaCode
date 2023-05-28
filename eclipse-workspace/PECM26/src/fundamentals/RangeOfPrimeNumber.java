package fundamentals;

import java.util.Scanner;

public class RangeOfPrimeNumber {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		int start = s.nextInt();
		System.out.println("Enter the ending value: ");
		int end = s.nextInt();
		
		int count = 0 ;
		 for (int i = start;i<=end;i++)
		 {
			 int j ;
			 for (j=2;j<i;j++)
			 {
				 if (i%j==0)
				{
					 break;
				}
			 }
			 
			 if (i==j)
			{
				System.out.println(i);
				count++;
			}
			 
		 }
		 System.out.println("the total prime number is : "+count);
	}
}
