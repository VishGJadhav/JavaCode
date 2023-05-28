package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Str1 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(35);
		l.add(75);
		l.add(6885);
		l.add(54);
		l.add(254);
		l.add(15);
		l.add(265);
		
		System.out.println(l);
		
		List<Integer>l2=l.stream().map(i->i+5).collect(Collectors.toList());
		
		System.out.println(l2);
	}
}
