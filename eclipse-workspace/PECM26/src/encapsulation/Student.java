package encapsulation;

public class Student {
		
		private String name ;
		private long phno ;
		private String email ;
		private double fee ;
		
		private int attendance ;
		private double amount = 36590.0 ;
		
		Student()
		{}
		
		Student(String name, Long phno, String email,double fee, int attendance)
		{
			this.name = name ;
			this.phno = phno ;
			this.email = email ;
			this.fee = fee ;
			this.attendance = attendance ;
		}
		
		public String getName()
		{
			return name ;
		}
		
		public long phno()
		{
			return phno ;
		}
		
		public void setPhNo(long oldphno, long newphno)
		{
			if (phno == oldphno) {
				
				phno = newphno;
				
				System.out.println("Mobile number changed Successfully!");
			}
			else {
				System.out.println("old mobile number is incorrect!");
			}
		}
		public void setEmail(String oldEmail, String newEmail)
		{
			if (oldEmail==email) {
				
				email = newEmail ;
				
				System.out.println("Email changed successfully!");
			}
			else {
				System.out.println("your details is incorrect!");
			}
			
		}
		public String getEmail()
		{
			return email ;
		}
		
		public void setFees(String name, long phno, double money)
		{
			if (this.name==name && this.phno==phno) 
			{
				
				if (fee==amount)
				{
					System.out.println("Fee is already pais!");
				}
				else if (fee+money <amount)
				{
					fee = fee + money ;
					System.out.println(fee);
					System.out.println("Money is updated!");
				}
				else if (fee + money > amount ) 
				{
					
					double diff = amount - fee ;
					
					fee  = fee + diff ;
					
					System.out.println("Are you willing for pay someone!");
					
					System.out.println("Remaining change is: "+(money-diff));
				}
			}
			else
			{
				System.out.println("incorrect details!");
			}
		}
		public double getFees()
		{
			return fee ;
			
		}
		
		public void attendance()
		{
			if (this.name==name && this.phno==phno)
			{
				
				if (amount==fee) {
					
					attendance ++ ;
					System.out.println("attend the class ");
				}
			}
			else {
				System.out.println("Sorry ! pay fees");
			}
		}
		
		public int getAttendance()
		{
			return attendance ;
		}
		
	
}
