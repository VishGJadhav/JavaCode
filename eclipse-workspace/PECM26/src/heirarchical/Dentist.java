package heirarchical;

public class Dentist extends Doctor {
		
		String spl ;
		String organ ;
		String hospital ;
		
		public Dentist() {
			// TODO Auto-generated constructor stub
		}
		
		Dentist(String name,String degree,double fee,String spl,String organ,String hospital)
		{
			super(name,degree,fee);
//			this.name = name ;
//			this.degree = degree ;
//			this.fee = fee ;
			this.spl = spl ;
			this.organ = organ ;
			this.hospital = hospital ;
					
		}
		public void displayDentist()
		{
			
			displayDoctor();
			
			System.out.println("Specialization: "+spl);
			System.out.println("Organ: "+organ);
			System.out.println("Hospital: "+hospital);
		}
}
