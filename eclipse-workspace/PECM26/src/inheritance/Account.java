package inheritance;

public class Account extends BankAccount {
		
		long accno ;
		String name ;
		String add ;
		double amount ;
		
		public Account() {
			
		}
		
		public Account(String bank, String type, String branch, String ifsc,
				long accno,String name,String add,double amount)
		{
			this.bank = bank ;
			this.type = type ;
			this.branch = branch ;
			this.ifsc = ifsc ;
			this.accno = accno ;
			this.name = name ;
			this.add  = add ;
			this.amount = amount ;
		}
		
		public void displayAccount()
		{
			System.out.println("AccNo: "+accno);
			System.out.println("Name: "+name);
			System.out.println("Address: "+add);
			System.out.println("Amount: "+amount);
			
			System.out.println("Bank name: "+bank);
			System.out.println("Type of Account: "+type);
			System.out.println("Branch: "+branch);
			System.out.println("IFSC code: "+ifsc);
		}
		
}
