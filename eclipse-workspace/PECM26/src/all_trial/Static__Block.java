package all_trial;

public class Static__Block {
	
	static
	{
		System.out.println("1");
	}
	static
	{
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		System.out.println("Hellooooooooo!");
	}
	static
	{
		System.out.println("2");
	}

}
