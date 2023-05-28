package array;

public class Min_Element {
public static void main(String[] args) {
		
		int [] a = {15,5,36,45,85,26,58};
		
		int min = a[0] ;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("The Min element: "+min);
	}
}
