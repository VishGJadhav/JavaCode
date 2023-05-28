package array;

public class BubbleSort {
		
		public static void main(String[] args)
		{
			
			int [] a = {5,15,18,27,36,18,8,1,-15};
			
			
			for (int i = 0; i < a.length-1; i++)
			{
			//	int count = 1 ;
				
				for (int j = i+1; j < a.length-1; j++) 
				{
					if (a[i] > a[j+1])
					{
						int temp = a[i] ;
						a[i] = a[j+1] ;
						a[j+1] = temp ;
					}
					
				}
			}
			
			
			for (int i = 0; i < a.length; i++)
			{
				
				System.out.print(a[i]+" ");
			}
				
		}
}
