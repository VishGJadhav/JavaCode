package collections;

import java.util.ArrayList;

public class Emp {

	public static void main(String[] args) {
		
		ArrayList db = new ArrayList();
		
		db.add(new Employee("Smith",7369,"research",800,"clerk","Foed"));
		db.add(new Employee("Allen",7499,"account",1600,"salesman","Blake"));
		db.add(new Employee("Ward",7521,"sales",2100,"analyst","Jones"));
		db.add(new Employee("Jones",7566,"research",2975,"manager","King"));
		db.add(new Employee("Martin",7654,"sales",1250,"salesman","Blake"));
		db.add(new Employee("Blake",7698,"sales",2850,"manager","king"));
		db.add(new Employee("Clarke",7782,"account",2450,"manager","King"));
		db.add(new Employee("King",7839,"account",5000,"president",null));
		db.add(new Employee("Turner",7844,"sales",1500,"salesman","Blake"));
		db.add(new Employee("Adams",7876,"research",1100,"clerk","Scott"));
		db.add(new Employee("James",7900,"sales",950,"clerk","Blake"));
		db.add(new Employee("Ford",7902,"research",3000,"analyst","Jones"));
		db.add(new Employee("Miller",7934,"account",1300,"clerk","Clarke"));
		
		
//		checkJob(db, "analyst");
		
		checkSalary(db,800, "max");
	
//		System.out.println(checkManager(db, "King"));
	
		checkName(db, "Cl");
	}
	
	
	
	public static void checkJob(ArrayList a1 , String job)
	{
		for (int i = 0; i < a1.size(); i++)
		{
			Employee e1 = (Employee)a1.get(i);
			
			if (e1.job.equals(job))
			{
				System.out.println(e1);
			}
		}
	}
	
	public static void checkSalary(ArrayList a2, double sal,String ip)
	{
		if (ip.equalsIgnoreCase("max"))
		{
			System.out.println("Name      "+"|"+"    Job    "+"|"+"      Sal");
			for (int i = 0; i < a2.size(); i++) 
			{
				Employee e1 = (Employee)a2.get(i);
				
				if (e1.sal>sal)
				{
					System.out.println(e1.name);
				}
			}
		}
		else if (ip.equalsIgnoreCase("min"))
		{
			for (int i = 0; i < a2.size(); i++) {
				
				Employee e1 = (Employee)a2.get(i);
				
				if (e1.sal<sal)
				{
					System.out.println(e1.name);
				}
			}
		}
		else
		{
			if (ip.equalsIgnoreCase("equal")) 
			{
				for (int i = 0; i < a2.size(); i++) {
					
					Employee e1 = (Employee)a2.get(i);
					
					if (e1.sal==sal)
					{
						System.out.println(e1.name+" "+e1.sal);
					}
				}
				
			}
		}
	}
	

	public static ArrayList checkManager(ArrayList a1,String name)
	{
		ArrayList filter = new ArrayList<>();
				
		
		for (int i = 0; i < a1.size(); i++) {
			
			Employee e1 = (Employee)a1.get(i);
			
			if (e1.manager==name)
			{
				filter.add(e1);
			}
		}
		return filter;
	}
	
	public static void checkName(ArrayList a1,String ch)
	{
		for (int i = 0; i < a1.size(); i++) {
			
			Employee e1 = (Employee)a1.get(i);
			
			if (e1.name.startsWith(ch)) 
			{
				System.out.println(e1.name);
			}
			  
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
