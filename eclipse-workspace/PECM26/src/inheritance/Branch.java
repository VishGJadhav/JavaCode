package inheritance;

public class Branch extends College
	{
		String type ;
		String hod ;
		int nolec ;
		int nostd ;
		
		public Branch() {
			// TODO Auto-generated constructor stub
		}

		public Branch(String type, String hod, int nolec, int nostd,String colname, int code, String location, String principal,
				String name,int unno,String place,String vc) {
			
			this.type = type;
			this.hod = hod;
			this.nolec = nolec;
			this.nostd = nostd;
			
			this.colname = colname;
			this.code = code;
			this.location = location;
			this.principal = principal;
			
			this.name = name;
			this.unno = unno;
			this.place = place;
			this.vc = vc;
			
			
		}
		public void displayBranch()
		{
			displayCollege() ;
			System.out.println("Type: "+type);
			System.out.println("HOD: "+hod);
			System.out.println("No Of Lecturer: "+nolec);
			System.out.println("No of Student: "+nostd);
		}
		
	
	}	
