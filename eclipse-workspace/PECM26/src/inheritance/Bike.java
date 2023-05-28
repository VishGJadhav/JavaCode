package inheritance;

public class Bike {
	
		int wheels ;
		int seats ;
		String fuel ;
		
		Bike(){}
		
		Bike(int wheel, int seat, String fuel)
		{
			wheels = wheel ;
			seats = seat ;
			this.fuel = fuel ;
		}
		
		public void displayBike()
		{
			System.out.println("Wheels: "+wheels);
			System.out.println("Seats: "+seats);
			System.out.println("Fuel: "+fuel);
		}
}
