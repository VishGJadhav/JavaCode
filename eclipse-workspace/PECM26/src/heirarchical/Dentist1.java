package heirarchical;

public class Dentist1 extends Doctor1{

	String spl ;
	String organ ;
	String hospital ;
	
	Dentist1(){}

	public Dentist1(String name,String degree,double fee,String spl, String organ, String hospital) {
		super(name,degree,fee);
		this.spl = spl;
		this.organ = organ;
		this.hospital = hospital;
	}
	
	public void displayDentist1()
	{
		displayDoctor1();
		System.out.println(spl);
		System.out.println(organ);
		System.out.println(hospital);
	}
	
	
}
