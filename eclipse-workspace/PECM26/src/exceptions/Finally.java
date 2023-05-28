package exceptions;

import java.util.InputMismatchException;

public class Finally {

	public static void main(String[] args) {
		try {
		System.out.println(10/0);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont divide by zero");
			// System.exit(0);
		}
		finally {
			System.out.println("Thank You");
		}
	}
}
 