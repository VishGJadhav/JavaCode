package array;

import java.util.Arrays;

public class PlanetDriver {
	
			public static void main(String[] args) {
				
				Planet [] p1 = new Planet [5] ;
				
				p1[0] = new Planet ("Mercury",15.2,2.5,45.2,4.1);
				p1[1] = new Planet ("Mercury",15,25,45,41);
				p1[2] = new Planet ("Mercury",15,25,45,41);
				p1[3] = new Planet ("Mercury",15,25,45,41);
				p1[4] = new Planet ("Mercury",15,25,45,41);
				
				double [] ct = new double [4] ;
				
				String [] gname = {"Oxygen","Hydrogen","Nitrogen","Carbon-di-oxide"};
				
				
				for(int i = 0;i<p1.length;i++)
				{
					for(int j = 0 ;j<ct.length;j++)
					{
						ct[j] = ct[j] + p1[i].gas[j] ;
					}
				}
				System.out.println(Arrays.toString(ct));
				
				double max = ct[0];
				
				int index = 0 ;
				
				for (int i = 0; i < ct.length; i++) {
					
					if (ct[i]>max) {
						max = ct[i];
						index = i ;
					}
				}
				System.out.println("The dominant gas in universe: "+gname[index]+" with "+max);
			}

}
