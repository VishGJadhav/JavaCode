package interfaces;

public interface Instagram {

	public abstract void msg(String ip) ;
	
	public void post(String ip );
	
	void comment(String com,String name) ;
	
	public static void welcome(String name)
	{
		System.out.println("Hey! "+name+ " Welcome to the Instagram!......");
	}
	
	void story(String ip) ;
}
