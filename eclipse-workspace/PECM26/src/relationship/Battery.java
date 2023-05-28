package relationship;

public class Battery {

			String name ;
			int capacity ;
			String size ;
			
			public Battery() {}

			public Battery(String name, int capacity, String size) {
				this.name = name;
				this.capacity = capacity;
				this.size = size;
			}
			
			public void displayBattery()
			{
				System.out.println("Name: "+name);
				System.out.println("Capacity: "+capacity);
				System.out.println("Size: "+size);
				
				System.out.println("Battery Created successfully !");
			}
			
			
			
			
}
