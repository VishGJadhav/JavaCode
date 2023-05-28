package array;

public class Rotation_Clockwise {
	public static void main(String[] args) {
		
		int [] a = {1,3,5,7,9};
		
		int temp = a[a.length-1];
		
		for (int i = a.length-1;i>0;i--) {
			a[i] = a[i-1] ;
					
		}
		a[0] = temp ;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
