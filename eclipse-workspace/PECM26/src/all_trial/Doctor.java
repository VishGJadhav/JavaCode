package all_trial;

public class Doctor {
	
	String name ;
	String degree ;
	double fee ;
	
	public Doctor() {
		System.out.println("From doctor default!");
	}
	
	Doctor(String name, String degree, double fee)
	{
		super();
		System.out.println("Doctor loading");
		this.name = name ;
		this.degree = degree ;
		this.fee = fee ;
		System.out.println("Doctor loaded");
	}
	
	public void displayDoctor()
	{
		System.out.println(name);
		System.out.println(degree);
		System.out.println(fee);
	}
	
}
