package collections;

import java.util.Scanner;

public class BloodDonate {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Month: ");
		
		int month = s.nextInt();
		
		switch (month) {
			case 1:
			{
				System.out.println("Jan");
				System.out.println("Enter the date: ");
				int date = s.nextInt();
				break;
			}
			case 2:
			{
				System.out.println("Feb");
				break;
			}
			case 3:
			{
				System.out.println("March");
				break;
			}
			case 4:
			{
				System.out.println("April");
				break;
			}
			case 5:
			{
				System.out.println("May");
				break;
			}
			case 6:
			{
				System.out.println("Jun");
				break;
			}
			case 7:
			{
				System.out.println("Jul");
				break;
			}
			case 8:
			{
				System.out.println("Aug");
				break;
			}
			case 9:
			{
				System.out.println("Sept");
				break;
			}
			case 10:
			{
				System.out.println("Oct");
				break;
			}
			case 11:
			{
				System.out.println("Nov");
				break;
			}
			case 12:
			{
				System.out.println("Dec");
				break;
			}
			
			default:
			{
				System.out.println("Enter the valid ip from range of 1 to 12 this is month range ");
			}
		}
	}
}
