package heirarchical;

public class Doctor1 {

	
		String name ;
		String degree ;
		double fee ;
		
		Doctor1(){}

		public Doctor1(String name, String degree, double fee) {
			
			this.name = name;
			this.degree = degree;
			this.fee = fee;
		}
		
		public void displayDoctor1()
		{
			System.out.println(name);
			System.out.println(degree);
			System.out.println(fee);
		}
		
		
}
