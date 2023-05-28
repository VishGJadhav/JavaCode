package exceptions;

public class EX1 {

	public static void main(String[] args) {
		
		
		div (5,0) ;
		
		
	}
	public static void div(int a, int b )
	{
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont divide by zero ");
		}
	}
		
}
