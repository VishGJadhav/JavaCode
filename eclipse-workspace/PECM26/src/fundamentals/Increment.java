package fundamentals;

public class Increment {
	public static void main(String[] args) {
		int x = 10 ;
		
		x++;
		System.out.println(x); // post increment
		
		x--;
		System.out.println(x); // post decrement
		
		++x;
		System.out.println(x); // pre-increment
		
		--x;
		System.out.println(x); // pre-decrement
	}
}
