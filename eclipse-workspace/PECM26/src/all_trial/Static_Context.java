package all_trial;

public class Static_Context {

	static int y ;
	static int x = 20 ;
	
	
	static 
	{
		System.out.println("from static block1");
		
	}
	
	public void m1()
	{
		System.out.println(s);
		y=20;
		System.out.println(y);
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		Static_Context s1 = new Static_Context();
			s1.m1();
			
			
			
	}
	static
	{
		System.out.println("From static block 2");
	}
	
	static String s = "INDIA" ;
}
