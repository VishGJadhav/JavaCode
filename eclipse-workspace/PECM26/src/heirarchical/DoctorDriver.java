package heirarchical;

public class DoctorDriver {
		
		public static void main(String[] args) {
			
			Orthopedic o1 = new Orthopedic("Vinod", "MBBS", 300, "Ortho", "Bone", "Dr.D Y Patil Hospital pune");
			
			o1.displayDoctor();
			o1.displayOrthopedic();
			
			Dentist d1 = new Dentist("Mahesh", "BDS", 200, "Dentist", "Teeth", "DY patil Hospital");
			
			d1.displayDentist();
		}
}
