package nyc.codingtutor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DifferentCollections {

	public static void main(String[] args) {
		/* List:
		 * allows duplicates
		 * keeps elements ordered by index
		 * allows nulls values
		 * common implementations: ArrayList, LinkedList, and Vector
		*/
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null);
		
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println(students.get(2));
		System.out.println(students.get(0));
		
		
		/* Set:
		 * 
		 * No duplicates
		 * Unordered
		 * Allows a null value
		 * Common implementations: HashSet, LinkedHashSet, TreeSet
		 */
		
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		states.add(null);
		
		
		System.out.println(states.size());
		System.out.println("Contains Delaware: " + states.contains("Delaware"));
		
		for (String state : states) {
			System.out.println(state);
		}
		
		
		/*Maps:
		 * 
		 * Map<K, V> - where k is key and v is value
		 * 
		 * Key value pairs (dictionary)
		 * Values can be duplicate, but not keys
		 * Common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
		 */
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		
		racerPlacements.remove(1);
		System.out.println("Size: " + racerPlacements.size());
		
		Collection<String> racers = racerPlacements.values();
		
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "To make something greater by adding");
		dictionary.put("Diminish", "To make or become less.");
		dictionary.put("Ostentatious", "Vulgar or pretentious");
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		
		

	}

}
