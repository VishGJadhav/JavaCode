package object;

public class Employee1Driver {
	
	public static void main(String[] args) {
		
		
		Employee1 e1 = new Employee1("Vinod", 125, "Qspider") ;
		Employee1 e2 = new Employee1("Vikas", 101, "Jspider") ;
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1==e2);  // comparing reference
		
		System.out.println(e1.equals(e2));   // comparing attributes  
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
		
	}

}
