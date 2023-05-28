package inheritance;

public class LoanDriver {
		public static void main(String[] args) {
			
			Car c1 = new Car("HDFC Bank", 750000, "Car Loan", "5 Yr", 10.5, "Maruti Suzuki",
					"Ertiga", 1150000, "CNG", 24) ;
			
				c1.displayCar();
				System.out.println("==================");
				c1.displayLoan();
		}
}
