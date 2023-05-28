package relationship;

public class Pendrive {
		
	String brand ;
	double price ;
	int memory ;
	int speed ;
	
	public Pendrive() {}

	public Pendrive(String brand, double price, int memory, int speed)
	{
		
		this.brand = brand;
		this.price = price;
		this.memory = memory;
		this.speed = speed;
	}
	
	public void displayPenDrive()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Memory: "+memory);
		System.out.println("Speed: "+speed);
	}
	
	
	
}
