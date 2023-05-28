package trial;

import java.sql.Date;

public class BookDriver {

	public static void main(String[] args) {
		
		Book b1 = new Book(1, "JAVA", "Shubham", new Date(2012, 12, 12));
		Book b2 = new Book(2, "C", "Rushikesh", new Date(2015, 1, 12));
		Book b3 = new Book(3, "JAVA", "Harish", new Date(2023, 3, 1));
		
		Library l1 = new Library();
		
		
	}
}
