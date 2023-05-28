package encapsulation;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Virat", 9876543210l, "Virat.anu@gmail.com",0,0) ;
		
		 s1.setFees("Virat", 9876543210l, 10000);
		
		System.out.println(s1.getAttendance());
		
		s1.setFees("Virat", 9876543210l, 36590);
	}

}
