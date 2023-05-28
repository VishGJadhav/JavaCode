package object;

public class Employee {

	String name ;
	int id ;
	String company ;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	Employee(String name,int id ,String company)
	{
		this.name = name ;
		this.id = id ;
		this.company = company ;
	}
	
//	public String toString()
//	{
//		return "Emp Name: "+name+" EmpID: "+id+" Company: "+company ;
//	}
	
	public boolean equals(Object e)
	{
		
		Employee E = (Employee) e  ;
		
		if (name == E.name && id ==E.id && company == E  .company)
		{
			 return true ;
		}
		return false ;
	}
}
