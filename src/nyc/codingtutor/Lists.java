package nyc.codingtutor;

import java.util.ArrayList;
import java.util.List;


public class Lists {

	public static void main(String[] args) {
		
//		List<String> reads as "list of string"
//		List<E> reads as "list of E" where E is the generic that will be replaced with the type
		
		List<String> sports = new ArrayList<String>();
		sports.add("Wresting");
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(1);
		
		
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		
		
		
		

	}

}
