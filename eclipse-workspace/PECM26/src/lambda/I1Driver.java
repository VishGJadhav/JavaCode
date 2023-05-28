package lambda;

public class I1Driver {


	public static void main(String[] args) 
	{
		
		I1 i = new I1()
		{
			public void add(int a,int b)
			{
				System.out.println(a+b);
			}
			
			public void mul(int x,int y )
			{
				System.out.println(x*y);
			}
		};
		
		i.add(50, 40);
		i.mul(5, 5);
		
		I1 i2 = new I1() {
			public void add(int a,int b)
			{
				System.out.println(a+b);
			}
			
			public void mul(int x,int y )
			{
				System.out.println(x*y);
			}
			
		};
				
				i2.add(20, 40);
				i2.mul(25, 25);
	}
}
