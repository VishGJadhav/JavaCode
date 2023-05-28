package collections;

public class Employee {

	String name;
	int Empid;
	String dept;
	double sal;
	String job;
	String manager;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int empid, String dept, double sal, String job, String manager) {
		super();
		this.name = name;
		Empid = empid; 
		this.dept = dept;
		this.sal = sal;
		this.job = job;
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "name=" + name + ", Empid=" + Empid + ", dept=" + dept + ", sal=" + sal + ", job=" + job
				+ ", manager=" + manager ;
	}
	
	
	
}
