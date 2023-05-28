package relationship;

public class LaptopDriver {
		public static void main(String[] args) {
			
			Laptop l1 = new Laptop("HP", 80000, 12, 2, "Silver") ;
			
			l1.displayLaptop();
			
			l1.insertPenDriver("SanDisk", 1200, 56, 6);
			
			l1.p1.displayPenDrive();
		}
}
