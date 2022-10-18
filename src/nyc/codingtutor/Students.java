package nyc.codingtutor;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		
//		String[] students = new String[3];
		String[] students = {"Tom Sawyer", "Jack Smith", "Bill Turner"};
		
		System.out.println(students);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			
		}
		
		for (String student : students) {
			System.out.println(student);
		}
	}

}
