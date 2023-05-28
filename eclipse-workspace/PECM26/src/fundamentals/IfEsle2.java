package fundamentals;

import java.util.Scanner;

public class IfEsle2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a hemoglobin: ");
		int hemo = s.nextInt();
		
		if (hemo>=13) {
			System.out.println("Pleae donate!");
		}
		else if (hemo<13) {
			System.out.println("Dont donate eat food");
		}
		
	}
}
