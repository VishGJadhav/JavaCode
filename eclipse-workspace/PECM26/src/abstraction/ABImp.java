package abstraction;

public class ABImp extends AB1{

	public void test()
	{
		System.out.println("From non static test() from child");
	}
	public static void demo()
	{
		System.out.println("from static demo() from child");
	}
}
