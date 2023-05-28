package inheritance;

public class RX100 extends Bike{
		
	String brand ; 
	double price ;
	String color ;
	int mileage ;
	
	RX100(){}
	
	RX100(int wheels, int seats, String fuel,
			String brand, double price, String color, int mileage)
	{
		this.brand = brand ;
		this.price = price ;
		this.color = color ;
		this.mileage = mileage ;
		
		this.wheels = wheels ;
		this.seats = seats ;
		this.fuel = fuel ;
		
	}
	public void displayRX100()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Colour: "+color);
		System.out.println("Mileage: "+mileage);
	}
}
