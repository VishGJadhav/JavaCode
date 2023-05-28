package inheritance;

public class College extends University
	{
		String colname ;
		int code ;
		String location ;
		String principal ;
		
		public College() {
			// TODO Auto-generated constructor stub
		}

		public College(String colname, int code, String location, String principal,
				String name, int unno, String place, String vc) 
		{
			
			this.colname = colname;
			this.code = code;
			this.location = location;
			this.principal = principal;
			
			this.name = name;
			this.unno = unno;
			this.place = place;
			this.vc = vc;
		}
		
		public void displayCollege()
		{
			displayUniversity() ;   
			System.out.println("College name: "+colname );
			System.out.println("Code: "+code);
			System.out.println("Loaction: "+location);
			System.out.println("Principal: "+principal);
		}
		
		
	}
