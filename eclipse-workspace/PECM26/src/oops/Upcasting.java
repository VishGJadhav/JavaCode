package oops;

public class Upcasting {
		
	String id ;
	int pin ;
	long phno ;
	
	public Upcasting() {
		// TODO Auto-generated constructor stub
	}

	public Upcasting(String id, int pin, long phno) {
		super();
		this.id = id;
		this.pin = pin;
		this.phno = phno;
	}
	
	public void displayUPI()
	{
		System.out.println(id);
		System.out.println(pin);
		System.out.println(phno);
	}
	
}
