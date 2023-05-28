package pack1;

public class Protect1 {

	protected static String s = "Vishnu" ;
	
	public static void main(String[] args) {
		
		System.out.println(s);
		
		Protect1 p1 = new Protect1();
		p1.vish();
	}
	
	protected void vish()
	{
		System.out.println("Protected method ()");
	}
}
