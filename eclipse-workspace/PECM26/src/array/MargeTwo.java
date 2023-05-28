package array;

public class MargeTwo {
	public static void main(String[] args) {
		
		char [] a = {'a','b','c','d','e'};
		char [] b = {'f','g','h','i'};
		char [] c = new char [a.length+b.length];
		
		char memory = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			c[memory] = a[i];
			memory++;
			
		}
		for (int i = 0; i < b.length; i++) {
			c[memory] = b[i];
			memory++;
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
