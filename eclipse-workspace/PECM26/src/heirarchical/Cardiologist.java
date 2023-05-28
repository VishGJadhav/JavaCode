package heirarchical;

public class Cardiologist extends Doctor {

	String spl ;
	String organ ;
	String hospital ;
	
	public Cardiologist() {
		// TODO Auto-generated constructor stub
	}
	
	Cardiologist(String name,String degree,double fee,String spl,String organ,String hospital)
	{
		this.name = name ;
		this.degree = degree ;
		this.fee = fee ;
		this.spl = spl ;
		this.organ = organ ;
		this.hospital = hospital ;
				
	}
	public void displayCardilogist()
	{
		
		displayDoctor();
		
		System.out.println("Specialization: "+spl);
		System.out.println("Organ: "+organ);
		System.out.println("Hospital: "+hospital);
	}		
}
