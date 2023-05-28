package fundamentals;

public class PrintEvenUpto50 {
	public static void main(String[] args) {
		int start = 0;
		int end = 50 ;
		
		int count = 0 ;
		while (start<=end) {
			if (start%2==0) {
				System.out.println(start);
				count++;
			}
			start++;
		}
		System.out.println("the total even number is: "+count);
		
	}
}
