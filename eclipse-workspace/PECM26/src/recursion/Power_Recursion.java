package recursion;

public class Power_Recursion 
{
		public static void main(String[] args)
		{
			
			System.out.println(power(2,5));
			
		}
		
		public static int power(int base, int raise)
		{
			if (raise==0) 
			{
				
				return 1 ;
			}
			else 
			{
				return base * power(base,raise-1) ;
			}
		}
		
}
