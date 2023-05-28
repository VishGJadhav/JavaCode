package array;

public class Max_Element {
	public static void main(String[] args) {
		
		int [] a = {15,5,36,45,85,26,58};
		
		int max = a[0] ;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("The max element: "+max);
				
	}
}
