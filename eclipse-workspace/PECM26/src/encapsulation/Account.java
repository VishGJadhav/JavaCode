package encapsulation;

public class Account {
		
	
		private String bankname ;
		private int accno ;
		private double balance ;
		private String type ; 
		private int pin ;
		private String name ;
		
		Account ()
		{}
		
		Account(String bankname, int accno, double balance, String type,
				int pin,String name)
		{
			this.bankname = bankname ;
			this.accno = accno ;
			this.balance = balance ;
			this.type = type ;
			this.pin = pin ;
			this.name = name ;
			
			System.out.println("Account created Successfully!");
		}
		
		public String getBankName()
		{
			
			return bankname ;
			
			
		}
		
		public int getAccountNumber()
		{
			System.out.println(accno);
			return accno ;
		}
		
		public String getType()
		{
			return type ;
		}
		
		public void setType(String type)
		{
			this.type = type ;
		}
		
		public String getName()
		{
			return name ;
		}
		
		public double getBalance(int accno, int pin)
		{
			if (this.accno == accno && this.pin == pin) {
				
				return balance ;
			}
			System.out.println("Invalid credentials!");
			
			return 0 ;
		}
		
		public void withdraw(int accno, int pin, double amount)
		{
			if (this.accno == accno && this.pin == pin) 
			{
				
				if ((balance-amount)>=1000)
				{
					
					balance-=amount;
					
					System.out.println(amount+" Amount Debited!");
					
					System.out.println("Available Balance is: "+balance);
				}
				else 
				{
					System.out.println("Insufficient Balance!");
				}
			}
			else 
			{
				System.out.println("please check your account details!");
			}
		}
		
		public void deposit(int accno, int pin, double amount)
		{
			if (this.accno == accno && this.pin == pin) {
				
				balance+=amount ;
				
				System.out.println(amount+" credited in your account");
				System.out.println("Your balance is: "+ balance);
			}
		}
		
		public void setPin(int accno, int oldpin, int newpin)
		{
			if (this.accno == accno && pin == oldpin) {
				
				pin = newpin ;
				
				System.out.println("Pin changed successfully!");
			}
			else {
				
				System.out.println("Please check your details!");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
