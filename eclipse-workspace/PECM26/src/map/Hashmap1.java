package map;

import java.util.HashMap;
import java.util.TreeSet;

public class Hashmap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> h1 = new HashMap<>();
		
		h1.put(101, "Mala");
		h1.put(104, "Kala");
		h1.put(167, "Lala");
		h1.put(123, "Bala");
		h1.put(123, "Sheela");
		
//		System.out.println(h1);
//		
//		System.out.println(h1.keySet());
//		System.out.println(h1.values());
//		System.out.println(h1.replace(123, "Shakeela"));
//		System.out.println(h1);
//		System.out.println(h1.putIfAbsent(100, "Raja"));
//		System.out.println(h1);
		
		h1.entrySet();
		System.out.println(h1);
	}
}
