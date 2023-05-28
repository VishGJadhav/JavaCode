package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		
		try
		{
			int n1 = s.nextInt();
			System.out.println("Enter the second number: ");
			int n2 = s.nextInt() ;
			
			int res = n1/n2 ;
			System.out.println(res);
		} 
		catch (ArithmeticException e) {
			System.out.println("Dont divide number by Zero!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the valid number!");
		}
		
		System.out.println("Thank You");
		
	}
}
