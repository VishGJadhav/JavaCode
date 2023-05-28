package inheritance;

public class GooglePay extends UPI{

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
			System.out.println("Bank: "+bank);
			System.out.println("ACCNO: "+accno);
			System.out.println("Rewards: "+rewards);
		}
}
