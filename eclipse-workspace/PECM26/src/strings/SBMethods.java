package strings;

public class SBMethods {

	public static void main(String[] args)
	{
		
		StringBuilder sb = new StringBuilder("Vishnu");
		
		 sb.setCharAt(0,'G');
		 sb.setCharAt(1,'o');
		 sb.setCharAt(2,'v');
		 sb.setCharAt(3,'i');
		 sb.setCharAt(4,'n');
		 sb.setCharAt(5,'d');
		 
		 System.out.println(sb);
		 sb.delete(1, 2);
		 System.out.println(sb);
		
		 
		
		
	}
	
	
	
//		public void setCharAt(int a,char b)
//		{
//			
//		}
	
}
