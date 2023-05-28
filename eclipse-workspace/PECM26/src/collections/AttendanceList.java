package collections;

import java.util.ArrayList;

public class AttendanceList {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();
		
		list.add(new Attendance("Vishnu","PECM26","ViShnu123@gmail.com","9673830375"));
		list.add(new Attendance("Yashpal","PECM26","yashpal123@gmail.com","9876543210"));
		list.add(new Attendance("Siddhesh","PECM26","siddhesh123@gmail.com","8164634615"));
		list.add(new Attendance("Roshan","PECM28","Roshan123@gmail.com","8536655635"));
		list.add(new Attendance("Vikas","PECM27","Vikas123@gmail.com","643487787767"));
		list.add(new Attendance("Shubham","PECM26","shubham123@gmail.com","8565435684568"));
		
//		System.out.println(checkBatch(list, "PECM26"));
//		checkNumber(list);
		
		checkEmail(list);
				
	}
	public static ArrayList checkBatch(ArrayList list,String batch)
	{
		ArrayList filter = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			
			Attendance a1 = (Attendance)list.get(i);
			
			if (a1.batch.equals(batch))
			{
				filter.add(a1);
			}
			
		}
		return filter ;
	}
	
	public static void checkNumber(ArrayList list)
	{
		for (int i = 0; i < list.size(); i++) {
			
			Attendance a1 = (Attendance)list.get(i);
			
			if (a1.phno.length()==10 && a1.phno.charAt(0)>='6')
			{
				continue;
			}
			else
			{
				System.out.println(a1.name+" Entered Wrong phone number!");
			}
		}
	}
	public static void checkEmail(ArrayList list)
	{
		for (int i = 0; i < list.size(); i++)
		{
			Attendance a1 = (Attendance)list.get(i); 	// Pending mail Verification
			
			if (a1.email.charAt(i)>='a' && a1.email.charAt(i)<='z')
			{
				
				continue;
			}
			else
			{
				System.out.println(a1.name+" Provides Wrong mail");
			}
			
			
			
			
		}
		
	}
}
