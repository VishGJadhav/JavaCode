package inheritance;

public class BankAccountDriver {

			public static void main(String[] args) {
				
				Account a1 = new Account("ICICI Bank", "Financial", "Pune", "PUN101010", 9876543210l,
						"Guddu ki gun", "Pune", 150000);
				
				a1.displayAccount();
				System.out.println("====================");
				a1.displayBank();
			}
}
