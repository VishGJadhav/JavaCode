package strings;

import java.util.Scanner;

public class CountWordOfSentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		
		String ip =  sc.nextLine();
		
		String [] words = ip.split(" ");
		
		System.out.println("Total words in sentence: "+words.length);
				 
	}
}
