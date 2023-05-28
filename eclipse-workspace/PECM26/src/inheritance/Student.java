package inheritance;

public class Student extends Branch
	{
		String stdname ;
		int roll ;
		int sem ;
		
		public Student() {
			// TODO Auto-generated constructor stub
		}

		public Student(String stdname, int roll, int sem,String type, String hod, 
				int nolec, int nostd,String colname, int code, String location, String principal,
				String name,int unno,String place,String vc) 
		{
			
			this.stdname = stdname;
			this.roll = roll;
			this.sem = sem;
			
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
		
		public void displayStudent()
		{
			displayBranch();
			
			System.out.println("Student Name: "+stdname);
			System.out.println("Roll No: "+roll);
			System.out.println("Semister: "+sem);
		}
		
		
	}
