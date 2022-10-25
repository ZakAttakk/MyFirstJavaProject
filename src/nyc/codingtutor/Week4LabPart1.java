package nyc.codingtutor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week4LabPart1 {

	public static void main(String[] args) {
		// strings cannot be changed (immutable) - the underlying object assigned to a variable can never be changed.  When concatenate to a string, we are actually creating a new string in memory.  String builder is mutable.

		
		StringBuilder myString = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			myString.append(Integer.toString(i) + ", ");
		}
		myString.append("9");
//		System.out.println(myString);
		
		
		List<String> myList = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			sb.append("word");
			myList.add(sb.toString());
		}

//		System.out.println(myList);
		
		
		List<String> names = new ArrayList<String>();
		names.add("Joe");
		names.add("Henry");
		names.add("Xi");
		names.add("Zach");
		names.add("Q");
//		System.out.println(getShortestStringFromList(names));
//		System.out.println(names);
		System.out.println("------------------");
//		System.out.println(switchFirstLast(names));
//		System.out.println(listIntoString(names));
//		System.out.println(findStringsInList(names, "e"));
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		Collections.addAll(numbers, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		
		System.out.println(findDivisibleNumbers(numbers));
	}
	
	public static String getShortestStringFromList(List<String> list) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < list.size(); i++) {
			
			if (i == 0) {
				sb.append(list.get(i));
			}

			if (list.get(i).length() < sb.length()) {
				sb.setLength(0);
				sb.append(list.get(i));
			}
		}
		
		return sb.toString();
	}
	
	public static List<String> switchFirstLast(List<String> list) {
		String first = list.get(0);
		String last = list.get(list.size() - 1);
		list.set(0, last);
		list.set(list.size() - 1, first);
//		System.out.println(first);
//		System.out.println(last);
		
		return list;
	}
	
	
	public static String listIntoString(List<String> strings) {
		StringBuilder sb = new StringBuilder();
		
		for (String item : strings) {
			sb.append(item);
		}
		
		return sb.toString();
	}
	
	public static List<String> findStringsInList(List<String> list, String string){
		
		List<String> result = new ArrayList<String>();
		
		for (String item : list) {
			if (item.contains(string)) {
				result.add(item);
			}
		}
		
		return result;
	}
	
	public static List<List<Integer>> findDivisibleNumbers(List<Integer> list){
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		List<Integer> div2 = new ArrayList<Integer>();
		List<Integer> div3 = new ArrayList<Integer>();
		List<Integer> div5 = new ArrayList<Integer>();
		
		for (Integer item : list) {
			if (item % 2 == 0) {
				div2.add(item);
			}
			if (item % 3 == 0) {
				div3.add(item);
			}
			if (item % 5 == 0) {
				div5.add(item);
			}
		}
		Collections.addAll(result, div2, div3, div5);
//		System.out.println(div2);
		
		return result;
	}
	
	
	 

}
