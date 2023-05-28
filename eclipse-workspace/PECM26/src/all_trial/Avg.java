package all_trial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the size of an Array");
			int size = s.nextInt();
			
			int [] a = new int [size] ;
			
			System.out.println("Array created!");
			System.out.println("Enter element: ");
			for (int i = 0; i < a.length; i++)
			{
				a[i] = s.nextInt();
			}
			int sum = 0 ;
			int avg = 0;
			
			for (int i = 0; i < a.length; i++) 
			{
				sum = sum +a[i] ;	
				avg = sum/size ;
				
			}
			System.out.println("the sum of element is: "+sum);
			System.out.println("the Average of element is: "+avg);
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the valid number!!");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("-ve size is not allowed!!");
		}
	}
}
