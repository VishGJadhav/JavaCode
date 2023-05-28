package all_trial;

public class SecondMinimumElement {

		public static int getSecondSmall(int[] a,int total)
		{
			for (int i = 0; i < total; i++)
			{
				
				for (int j = i+1; j < total; j++) 
				{
					if (a[i]>a[j])
					{
						int temp = a[i] ;
						a[i] = a[j] ;
						a[j] = temp ;
					}
				}
			}
			
			return  a[1] ;
		}
		
		public static void main(String[] args) 
		{
			int [] a = {5,48,-8,25,85,65,47,4,-9};
			
			System.out.println(getSecondSmall(a, 9));
			
		}
}
