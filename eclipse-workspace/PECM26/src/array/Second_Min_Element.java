package array;

	public class Second_Min_Element {
		public static void main(String[] args) {
			
		
		int [] a = {10,15,41,35,9,7,65};
		int min = a[0] ;
		int secmin = a[1] ;
	
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min)
			{
			
				secmin = min ;
				min = a[i] ;
			}
			else if (a[i] <secmin && a[i] != min) {
			
				secmin = a[i] ;
			}
		
		}
		System.out.println("The max element: "+min);
		System.out.println("The second max elemenet: "+secmin);
	}
}
