package recursion;

public class Factorial_Of_Number {
	
	public static void main(String[] args) {
		
		System.out.println(fact(5));
		
	}
	public static int fact(int num)
	{
		if (num==0) {
			return 1 ;
		}
		else
		{
			return num*fact(num-1) ;
		}
	}

}
