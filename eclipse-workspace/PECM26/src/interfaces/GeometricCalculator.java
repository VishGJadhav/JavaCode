package interfaces;

public interface GeometricCalculator {

		double pi = 22.0/7 ; //(public static final)
		
		double recArea(double bidth,double length) ;
		
		double cirArea(double rad);
		
		public abstract double  squArea(double side) ;
		
		double cirCircum(double rad) ;
		
		double recPerimetr(double bidth,double length) ;
		
		double cmToInch(double cm) ;
		
}
