package object;

public class Employee1 {

	String name ;
	int id ;
	String company ;
	
	public Employee1() {
		// TODO Auto-generated constructor stub
	}
	
	Employee1(String name,int id ,String company)
	{
		this.name = name ;
		this.id = id ;
		this.company = company ;
	}
	
	public int hashCode()
	{
		int hc = 0 ;
		hc = hc + id ;
		hc = hc + name.hashCode();
		hc = hc + company.hashCode();
		
		return hc ;
	}

}
