package collections;

public class Students implements Comparable {

	String name;
	String col;
	int roll ;
	int yop ;
	double percent ;
	
	
	public Students() {
		super();
		
	}


	public Students(String name, String col, int roll, int yop, double percent) {
		super();
		this.name = name;
		this.col = col;
		this.roll = roll;
		this.yop = yop;
		this.percent = percent;
	}
	
//	public String toString()
//	{
//		return name+" "+col+" "+roll+" "+yop+" "+percent;
//	}
	
	public String toString()
	{
		return name+" "+yop;
	}
	
	public int compareTo(Object o)
	{
		Students s1 = (Students)o;
		
		return this.name.compareToIgnoreCase(s1.name);
		
//		if (this.percent>s1.percent)
//		{
//			return 1 ;
//		}
//		else if (this.percent<s1.percent)
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
		
//		return this.name.compareTo(s1.name);
//		return this.col.compareTo(s1.col);
		
//		if (this.yop>s1.yop )
//		{
//			return 1;
//		}
//		else if (this.yop<s1.yop)
//		{
//			return -1;
//		}
//		else 
//		{
//			return 0 ;	
//		}
	}
}
