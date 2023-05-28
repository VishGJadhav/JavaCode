package abstraction;

public class LenevoDriver {

	public static void main(String[] args) {
		
		Lenevo l1 = new Windows();
		
		l1.welcome("Vishnu");
		l1.calculator(10, 20);
		
		Lenevo l2 = new Linux() ;
		
		l2.welcome("Vishnu");
		l2.calculator(100, 200);
	}
}
