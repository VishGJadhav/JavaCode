package inheritance;

public class Personal_Loan extends Bank_Loan {
		
		String name ;
		int age ;
		String add ;
		double salary ;
		long adhar ;
		String pan ;
		
		Personal_Loan()
		{}
		
		Personal_Loan(String bank, double amount, String type, String duration, double intrest,
				String name,int age,String add,double salary,long adhar,String pan)
		{
			this.name = name ;
			this.age = age ;
			this.add = add ;
			this.salary = salary ;
			this.adhar = adhar ;
			this.pan = pan ;
			
			this.bank = bank ;
			this.amount = amount ;
			this.type = type ;
			this.duration = duration ;
			this.intrest = intrest ;
			
		}
		
		public void displayPersonalLoan()
		{
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			System.out.println("Address: "+add);
			System.out.println("Salary: "+salary);
			System.out.println("Adhar card: "+adhar);
			System.out.println("PAN: "+pan);
		}
		
}
