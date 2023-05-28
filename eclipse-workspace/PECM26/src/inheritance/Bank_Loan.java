package inheritance;

public class Bank_Loan {
		 
		String bank ;
		double amount ;
		String type ;
		String duration ;
		double intrest ;
		
		Bank_Loan(){}
		
		Bank_Loan(String bank,  double amount, String type, String duration,
				double intrest)
		{
			this.bank = bank ;
			this.amount = amount ;
			this.type = type ;
			this.duration = duration ;
			this.intrest = intrest ;
					
		}
		
		public void displayLoan()
		{
			System.out.println("Bank Name: "+bank);
			System.out.println("Amount: "+amount);
			System.out.println("Type: "+type);
			System.out.println("Duration: "+duration);
			System.out.println("Intrest Rate: "+intrest);
		}
		
}
