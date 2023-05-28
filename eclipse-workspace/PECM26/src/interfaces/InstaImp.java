package interfaces;

public class InstaImp implements Instagram {

	String name;
	int pass;
	
	public InstaImp() {
		// TODO Auto-generated constructor stub
	}
	
	public InstaImp(String name, int pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	public void msg(String ip)
	{
		System.out.println(ip);
		System.out.println("Massege Sent!");
	}
	public void post(String ip)
	{
		System.out.println(ip);
		System.out.println("Posted!");
	}
	
	public void comment(String ip,String name)
	{
		System.out.println(ip);
		System.out.println(name+" commented!");
		
	}
	public void story(String ip)
	{
		System.out.println(ip);
		System.out.println("Story Posted!");
	}
}
