package trial;

import java.sql.Date;

public class Book  {

	int id ;
	String tital ;
	String author ;
	Date releaseDate ;
	
	Book()
	{
		
	}
	Book(int id,String tital,String author,Date releaseDate)
	{
		super();
		this.id = id ;
		this.tital = tital ;
		this.author = author;
		this.releaseDate = releaseDate ;
	}
	
}
