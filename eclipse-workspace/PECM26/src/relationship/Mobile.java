package relationship;

public class Mobile {

	
			String brand ; 
			double price ;
			int model ;
			String color ;
			
			Battery b1 = new Battery("Li-Ion",5000,"3*3") ;

			public Mobile() {}

			public Mobile(String brand, double price, int model, String color) {
				
				this.brand = brand;
				this.price = price;
				this.model = model;
				this.color = color;
			
			}
			
			public void displayMobile()
			{
				System.out.println("Brand: "+brand);
				System.out.println("Price: "+price);
				System.out.println("Model: "+model);
				System.out.println("Colour: "+color);
				
				System.out.println("Mobile is created successfully!");
			}
			
			
			
					
}
