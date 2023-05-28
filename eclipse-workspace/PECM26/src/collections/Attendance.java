package collections;

public class Attendance {

	String name ;
	String batch;
	String email ;
	String phno;
	
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attendance(String name, String batch, String email, String phno) {
		super();
		this.name = name;
		this.batch = batch;
		this.email = email;
		this.phno = phno;
	}
	
	public void displayAttendance()
	{
		System.out.println(name);
		System.out.println(batch);
		System.out.println(email);
		System.out.println(phno);
		
	}

	@Override
	public String toString() {
		return "name=" + name + ", batch=" + batch + ", email=" + email + ", phno=" + phno ;
	}
	
	
}
