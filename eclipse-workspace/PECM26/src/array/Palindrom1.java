package array;

public class Palindrom1 {
	public static void main(String[] args) {
		
		char [] ch1 = {'a','b','c','b','a'};
		char [] ch2 = new char [ch1.length] ;
		
		int j = ch1.length-1;
		
		for (int i = 0; i < ch1.length; i++) {
			ch2[i] = ch1[j] ;
			j--;
		}
		int i ;
		
		for ( i = 0; i < ch2.length; i++) {
			if (ch1[i]!=ch2[i]) {
				System.out.println("Not Palindrom");
				break;
			}
		}
		if (i==ch2.length) {
			System.out.println("Palindrom");
		}
	}
}
