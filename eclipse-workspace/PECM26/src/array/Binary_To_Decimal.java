package array;

public class Binary_To_Decimal {
		public static void main(String[] args) {
		
			int [] bin = {1,0,1,1,1,0};
			
			int dec = 0 ; // sum = 0 ;
			int raise = 0 ;
			
			for(int i = bin.length-1;i>=0;i--)
			{
				/*dec = dec + (bin[i]*(int)(Math.pow(2, raise))) ; // sum = sum + (bin[i]*(int)(Math.pow(2, raise)));
				
				raise ++ ;*/
				
				if (bin[i]!=0) {
					
					dec = dec + (bin[i]*(int)(Math.pow(2, raise))) ;
					
				}
				raise ++ ;
				
				
				
			}
			
			System.out.println("the decimal of:  "+dec);
		}
}
