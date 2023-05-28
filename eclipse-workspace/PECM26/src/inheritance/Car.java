package inheritance;

public class Car extends Bank_Loan {
	
	String brand ;
	String model ;
	double price ;
	String fuel ;
	int mileage ;
	
	public Car() {
		
	}
	public Car(String bank, double amount, String type, String duration, double intrest,
			String brand,String model,double price,String fuel,int mileage) 
	{
		this.brand = brand ;
		this.model = model ;
		this.price = price ;
		this.fuel = fuel ;
		this.mileage = mileage ;
		
		this.bank = bank ;
		this.amount = amount ;
		this.type = type ;
		this.duration = duration ; 
		this.intrest  = intrest ;
		
	}
	
	public void displayCar()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		System.out.println("Fuel Type: "+fuel);
		System.out.println("Mileage: "+mileage);
	}
	
	
	
}
