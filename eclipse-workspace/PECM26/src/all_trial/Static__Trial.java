package all_trial;

public class Static__Trial {
		
	public static boolean checkEven(int num)
	{
		return (num%2==0 ? true: false);
	}
	
	public static void main(String[] args)
	{
		
		if (checkEven(8))
		{
			System.out.println("Even");
		}
		else	
		{
			System.out.println("Odd");
		}
	}
}
