package heirarchical;

public class Doctor {
		
		String name ;
		String degree ;
		double fee ;
		
		public Doctor() {
			// TODO Auto-generated constructor stub
		}
		
		Doctor(String name,String degree,double fee)
		{
			this.name = name ;
			this.degree = degree ;
			this.fee = fee ;
			
		}
		public void displayDoctor()
		{
			System.out.println("Name: "+name);
			System.out.println("Degree: "+degree);
			System.out.println("Fee: "+fee);
		}
}
