package object;

public class Student {

	String name ;
	String col ;
	String branch ;
	int roll ;
	
	Student()
	{}
	
	Student(String name,String col,String branch,int roll)
	{
		this.name = name ;
		this.col = col ;
		this.branch = branch ;
		this.roll = roll ;
	}
	
	public String toString()
	{
		return "[ Name: "+name+",College Name: "+col+",Branch Name: "+branch+",Roll No:"+roll+"]" ;
	}
}
