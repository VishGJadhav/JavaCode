package recursion;

public class EvenOdd__withoutLoop {
	public static void main(String[] args) {
		
		int num = 10;
		
		if ((num/2)*2==num) {
			System.out.println("It is Even");
			//return ;
			System.exit(0);
		}
		System.out.println("It is Odd");
	}
}
