package fundamentals;

public class IfElseStatements {
	public static void main(String[] args) {
		System.out.println("main method starts execution");
		
		if (false) // condition is false then if block skipped & else block get in chance
		{
			System.out.println("if block gets executed!");
		}
		else {
			System.out.println("else block gest executed!");
		}
		
		System.out.println("main method end");
	}

}
