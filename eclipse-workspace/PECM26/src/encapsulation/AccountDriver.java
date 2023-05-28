package encapsulation;

public class AccountDriver {

		public static void main(String[] args) {
			 
			Account a1 = new Account("Axis",123456789,750000,"Savings",1234,"Vishnukant Jadhav") ;
			
			a1.getBalance(123456789, 1234) ; 
			
			String s =a1.getBankName();
			System.out.println(s);
			
			
			
			
			
			
		}
}
