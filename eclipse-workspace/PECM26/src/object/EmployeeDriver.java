package object;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Vinod", 101, "Qspider") ;
		Employee e2 = new Employee("Vinod", 101, "Qspider") ;
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1==e2);  // comparing reference
		
		System.out.println(e1.equals(e2));   // comparing attributes
		
		
	}

}
