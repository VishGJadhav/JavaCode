package inheritance;

public class UPIDriver {
	
		public static void main(String[] args) {
			
			GooglePay g1 = new GooglePay("123@Axis", 1234, 9673830375l, "Axis", 9876543210l, "Good Luck");
			
		/*	g1.displayGPay();
			g1.displayUPI(); */
			
			UPI u1 = g1 ;
			
			u1.displayUPI();
			
			 // u1.displayGPay();
		}
}
