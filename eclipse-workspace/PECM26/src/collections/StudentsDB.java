package collections;

import java.util.ArrayList;
import java.util.Collections;

public class StudentsDB {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList<Students> a1 = new ArrayList<>();
		
		a1.add(new Students("Vishnu", "Qsp", 4525, 2022, 78.32));
		a1.add(new Students("Yash", "Qsp", 3582, 2021, 85.25));
		a1.add(new Students("Sid", "Qsp", 8542, 2020, 75.36));
		a1.add(new Students("Omkar", "Qsp", 3246, 2022, 95.2));
		a1.add(new Students("Mahesh", "Qsp", 6525, 2019, 84.36));
		a1.add(new Students("Vinod", "Qsp", 1585, 2023, 91.25));
		a1.add(new Students("Avesh", "Qsp", 5468, 2018, 95.36));
		
		Collections.sort(a1);
		System.out.println("Name"+"   "+"Yop");
		System.out.println("=================");
		for (Students students : a1) 
		{
			System.out.println(students);
		}
		
	}
}
