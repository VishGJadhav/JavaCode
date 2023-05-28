package oops;

public class GPayDriver {
		
	public static void main(String[] args) {
		
		System.out.println("main Begin");
		Upcasting g1 = new Upcasting();
		
	   
		GooglePay gp1 = (GooglePay) g1 ;
		gp1.displayGPay();
		gp1.displayUPI();
		
		
		
		
		
		
		
		
	}
}
