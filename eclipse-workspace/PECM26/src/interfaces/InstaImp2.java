package interfaces;

public class InstaImp2 extends InstaImp{

	public InstaImp2() {
		// TODO Auto-generated constructor stub
	}
	InstaImp2(String name,int pass)
	{
		super(name,pass);
	}
	
	public void story(String ip)
	{
		System.out.println(ip);
		System.out.println("Strory Updated!");
	}
}
