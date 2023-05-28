package array;

public class Second_Max_Element {
	public static void main(String[] args) {
		int [] a = {10,15,41,35,9,7,65};
		
		int max = a[0] ;
		
		int secmax = a[1] ;
		
		for (int i = 0; i < a.length; i++) 
		{
			
			if (a[i]>max) 
			{
				
				secmax = max ;
				max = a[i] ;
			}
			else if (a[i] >secmax && a[i] != max)
			{
				
				secmax = a[i] ;
			}
			
		}
		System.out.println("The max element: "+max);
		System.out.println("The second max elemenet: "+secmax);
	}
}
