package inheritance;

public class University {
		
		String name ;
		int unno ;
		String place ;
		String vc ;
		
		public University() {}

		public University(String name, int unno, String place, String vc) {
			
			this.name = name;
			this.unno = unno;
			this.place = place;
			this.vc = vc;
		}
		
		public void displayUniversity()
		{
			System.out.println("UniversityName: "+name);
			System.out.println("UNO: "+unno);
			System.out.println("Place: "+place);
			System.out.println("Voice chanceller: "+vc);
		}
		
		
}
