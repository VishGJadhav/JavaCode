package inheritance;

public class UPI {

		String id ;
		int pin ;
		long phno ;
		
		public UPI() {
			// TODO Auto-generated constructor stub
		}
		
		UPI(String id,int pin, long phno)
		{
			super();
			this.id = id ;
			this.pin = pin ;
			this.phno = phno ;
			
		}
		public void displayUPI()
		{
			System.out.println("ID: "+id);
			System.out.println("Pin: "+pin);
			System.out.println("Phno:"+phno);
		}
}
