package polymorphism;

public class Pubg {
	
	int bullets = 30 ;
	
	public void run()
	{
		System.out.println("Ran!!");
	}
	public void jump()
	{
		System.out.println("Jumped!!");
	}
	
	public void reloadAkm()
	{
		System.out.println("Reloaded!!");
	}
	
	public void fireAkm()
	{
		if (bullets>0) {
			
			System.out.println("fired!!");
			
			bullets -= 1 ;
		}
		else
		{
			System.out.println("Reload!!");
		}
	}
	public void recoilAkm()
	{
		System.out.println(20);
	}
}
