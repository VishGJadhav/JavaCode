package oops;

public class GooglePay extends Upcasting {
		
	String bank ;
	long accno ;
	String rewards ;
	
	public GooglePay() {
		// TODO Auto-generated constructor stub
	}

	public GooglePay(String id, int pin, long phno, String bank, long accno, String rewards) {
		super(id, pin, phno);
		this.bank = bank;
		this.accno = accno;
		this.rewards = rewards;
	}
	
	public void displayGPay()
	{
		System.out.println(bank);
		System.out.println(accno);
		System.out.println(rewards);
	}
	
}
