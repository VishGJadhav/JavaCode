package array;

public class ZigZag {
	public static void main(String[] args) {
		
		int [] a = {1,3,5,7,9};
		int [] b = {2,4,6,8,10};
		
		int [] res = new int [a.length+b.length];
		
		int j=0;
		for (int i = 0; i < res.length; i+=2) {
			res[i] = a[j] ;
			res[i+1] = b[j];
			j++;
			
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
