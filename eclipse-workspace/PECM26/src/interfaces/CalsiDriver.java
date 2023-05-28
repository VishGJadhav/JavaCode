package interfaces;

import java.util.Scanner;

public class CalsiDriver {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		double rad = 0 , bidth = 0 , length = 0, side = 0;
		
		System.out.println("Enter the option: ");
		System.out.println("1.Rectangle calculation:");
		System.out.println("2.circle calculation: ");
		System.out.println("3.Square calculation: ");
		
		int ip = s.nextInt();
		
		switch (ip){
		case 1:
		{
			System.out.println("Enter the bidth in cm: ");
			bidth = s.nextDouble();
			System.out.println("Enter the length in cm: ");
			length = s.nextDouble();
			
		}
			
			break;
		case 2:
		{
			System.out.println("Enter the radius in cm: ");
			rad = s.nextDouble();
		}
		break;
		
		case 3:
		{
			System.out.println("Enter the Square side in cm: ");
			side = s.nextDouble();
		}
			break ;
			
		default:
		{
			System.out.println("Invalid Format");
		}
			
		}
		
		GeometricCalculator g1 = new Calculator() ;
	
		System.out.println(g1.cmToInch(g1.recArea( bidth, length)));
		 
		
	}
}
