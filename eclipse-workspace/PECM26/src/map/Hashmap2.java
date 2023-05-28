package map;

import java.util.HashMap;
import java.util.Set;

public class Hashmap2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> h1 = new HashMap<>();
		h1.put(101, "Vishnu");
		h1.put(105, "Yashpal");
		h1.put(102, "Siddhesh");
		h1.put(99, "Omkar");
		h1.put(98, "Vish");
		
		System.out.println(h1);
		
		System.out.println(h1.put(101, "Mahesh"));
		System.out.println(h1);
		
		System.out.println(h1.keySet());
		System.out.println(h1.values());
		
		
	}
	
	
}
