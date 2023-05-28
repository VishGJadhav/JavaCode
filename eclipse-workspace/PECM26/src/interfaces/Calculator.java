package interfaces;

public class Calculator implements GeometricCalculator {

	@Override
	public double recArea(double bidth, double length) {
		double ans = bidth * length ;
		return ans;
	}

	@Override
	public double cirArea(double rad) {
		double ans = 2*(GeometricCalculator.pi*rad);
		return ans;
	}

	@Override
	public double squArea(double side) {
		double ans = side * 4 ;						
		return ans;
	}

	@Override
	public double cirCircum(double rad) {
		
		return 2*GeometricCalculator.pi*rad ;
	}

	@Override
	public double recPerimetr(double bidth, double length) {
		
		return 2*(bidth + length);
	}
	
	public double cmToInch(double cm)
	{
		return cm / 2.54 ;
	}

	
}
