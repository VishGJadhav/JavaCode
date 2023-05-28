package all_trial;

public class Dentist extends Doctor {

		String spl ;
		String organ ;
		String hospital ;
		
		public Dentist() {
			super();
			
			System.out.println("From Dentist default!");
		}

		public Dentist(String name, String degree, double fee, String spl, String organ, String hspital) {
			super(name, degree, fee);
			
			System.out.println("Dentist loading");
			this.spl = spl;
			this.organ = organ;
			this.hospital = hspital;
			
			System.out.println("Dentist loaded");
		}
		
		public void displayDentist()
		{
			System.out.println(spl);
			System.out.println(organ);
			System.out.println(hospital);
		}
		
}
