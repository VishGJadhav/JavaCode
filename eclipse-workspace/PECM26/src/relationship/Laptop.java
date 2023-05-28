package relationship;

public class Laptop {
	
	String name ;
	double cost ;
	int ram ;
	int hd ;
	String color ;
	
	Pendrive p1 ;
	
	
	public Laptop() {
		
		// TODO Auto-generated constructor stub
	}


	public Laptop(String name, double cost, int ram, int hd, String color) {
		
		this.name = name;
		this.cost = cost;
		this.ram = ram;
		this.hd = hd;
		this.color = color;
	}
	
	public void insertPenDriver(String brand,double price,int memory,int speed)
	{
		p1 = new Pendrive(brand,price,memory,speed);
		
		System.out.println("Pendrive is inserted!");
	}
	
	
	public void displayLaptop()
	{
		System.out.println("Name: "+name);
		System.out.println("Cost: "+cost);
		System.out.println("RAM: "+ram);
		System.out.println("HardDisk: "+hd);
		System.out.println("Colour: "+color);
	}
	
	

}
