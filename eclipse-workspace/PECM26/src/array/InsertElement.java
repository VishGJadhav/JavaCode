package array;

import java.util.Scanner;

public class InsertElement {

		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in) ;
			
			int [] a = {1,2,3,4,5};
			
			System.out.println("Enter the value to be inserted: ");
			int value = s.nextInt() ;
			
			System.out.println("Enter the position of insertion: ");
			int position = s.nextInt();
			
			int [] res = new int [a.length+1] ;
					
					
			
			for (int i = 0; i < res.length; i++) {
				
				if (i<position) {
					
					res[i] = a[i] ;
					
				}
				else if (i==position) {
					res[i] = value ;
				}
				else {
					res[i] = a[i-1] ;
				}
				
			}
			
			for (int i = 0; i < res.length; i++) {
				System.out.println(res[i]);
			}
			
			
					
		}
	
}
