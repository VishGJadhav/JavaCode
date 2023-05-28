package array;

public class Method_For_BubbleSort {
		
		public static void main(String[] args) {
			
			int [] a = {17,5,-5,0,52,19,105,20,35};
			
			 int[] ans = sort(a) ;
			
			 for (int j = 0; j < ans.length; j++) {
				
				 System.out.print(ans[j]+",");
			}
			
			
			
		}
		
		public static int[] sort(int [] a)
		{
			for (int i = 0; i < a.length-1; i++) {
				
				for (int j = 0; j < a.length-1-i; j++) {
					
					if (a[j] > a[j+1]) 
					{
						int temp = a[j] ;
						a[j] = a[j+1] ;
						a[j+1] = temp ;
					}
				}
			}
			return a ;
		}
}
