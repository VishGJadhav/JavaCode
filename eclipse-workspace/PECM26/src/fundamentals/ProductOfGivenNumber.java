package fundamentals;

import java.util.Scanner;

public class ProductOfGivenNumber {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = s.nextInt();
		
		int prod = 1 ; 
		while (num!=0) {
			int rem = num % 10 ;
			prod = prod * rem ;
			num/=10;
		}	
		System.out.println(prod);
	}
}
