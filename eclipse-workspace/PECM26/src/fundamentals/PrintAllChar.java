package fundamentals;

public class PrintAllChar {
	public static void main(String[] args) {
		char ch = 0 ;
		while (ch<127) {
			System.out.println((int)ch+"-----"+ch);
			ch++;
		}
	}
}
