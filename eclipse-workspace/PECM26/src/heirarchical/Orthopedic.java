package heirarchical;

public class Orthopedic extends Doctor {

	String spl ;
	String organ ;
	String hospital ;
	
	public Orthopedic() {
		// TODO Auto-generated constructor stub
	}
	
	Orthopedic(String name,String degree,double fee,String spl,String organ,String hospital)
	{
		this.name = name ;
		this.degree = degree ;
		this.fee = fee ;
		this.spl = spl ;
		this.organ = organ ;
		this.hospital = hospital ;
				
	}
	public void displayOrthopedic()
	{
		
		displayDoctor();
		
		System.out.println("Specialization: "+spl);
		System.out.println("Organ: "+organ);
		System.out.println("Hospital: "+hospital);
	}
}
