package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter the size of an Array: ");
		
		try
		{
			int size = s.nextInt();
			
			int [] a = new int [size] ;
			
			System.out.println("Array created Success");
			
			System.out.println("Enter element in Array: ");
			
			for (int i = 0; i < a.length; i++)
			{
				a[i] = s.nextInt();
						
			}
			
			System.out.println("Element Stored");
			
			System.out.println("Enter numerator index: ");
			int num = s.nextInt();
			
			System.out.println("Enter denominator index: ");
			
			int den = s.nextInt();
			
			int res = a[num]/a[den];
			
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont divide number by Zero!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the valid number");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Cant create -ve size and more than size of array");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Cant create -ve size of an array");
		}
		
		System.out.println("Thank You");
		
		
		
		
	}
}
