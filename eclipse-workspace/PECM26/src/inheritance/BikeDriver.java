package inheritance;

public class BikeDriver {
		
	public static void main(String[] args) {
		
		RX100 r1 = new RX100(2, 2, "Petrol", "Yamaha", 150000, "Red", 35);
		
		r1.displayRX100();
		
		System.out.println("============================");
		
		r1.displayBike();
		
				
	}
}
