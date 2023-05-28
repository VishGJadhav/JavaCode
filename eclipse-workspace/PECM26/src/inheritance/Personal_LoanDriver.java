package inheritance;

public class Personal_LoanDriver {

	public static void main(String[] args) {
		
		Personal_Loan l1 = new Personal_Loan("HDFC Bank", 350000, "Personal", "2 Yr", 11.50, "Vishnukant Jadhav",
				26, "Pune city",35000, 800876134275l, "BEKPJ8231H") ;
		
		l1.displayPersonalLoan();
		System.out.println("=================");
		l1.displayLoan();
	}
}
