package inheritance;

public class BankAccount {
		
	String bank ;
	String type ; 
	String branch ;
	String ifsc ;
	public BankAccount() {}
	
	public BankAccount(String bank, String type, String branch, String ifsc) {
		
		this.bank = bank;
		this.type = type;
		this.branch = branch;
		this.ifsc = ifsc;
	}
	
	public void displayBank()
	{
		System.out.println("Bank name: "+bank);
		System.out.println("Type of Account: "+type);
		System.out.println("Branch: "+branch);
		System.out.println("IFSC code: "+ifsc);
	}
	
}
