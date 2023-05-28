package array;

import java.util.Scanner;

public class BinarySearch {

		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			
			int [] ip = {5,16,19,22,52,150,310};
			
			System.out.println("enter the key Value: ");
			int key = s.nextInt();
			
			int start = 0 ;
			int end  = ip.length-1 ;
			int mid = (start+end)/2 ;
			
			boolean found = false ;
			
			for (int i = 0; i < ip.length; i++) {
				
				if (ip[mid] ==key) {
					
					found = true ;
					break;
				}
				else if (key > ip[mid]) {
					start = mid + 1 ;
				}
				else if (key <ip[mid]) {
					end = mid - 1 ;
				}
				
				mid = (start+end)/2;
			}
			
			if (found==true) {
				
				System.out.println("Key Found at: "+(mid+1)+" position");
			}
			else
			{
				System.out.println("Key Not found!");
			}
		}
}
