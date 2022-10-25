package nyc.codingtutor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsNamesMenuApp {
	
	static Scanner scanner = new Scanner(System.in);
	static List<String> students = new ArrayList<String>();

	public static void main(String[] args) {
		
		int choice = 0;
		
		while (choice != 4) {
			
			showMenu();
			
			choice = getUserChoice();
			if (choice == 1) {
				printStudentNames();
			} else if (choice == 2) {
				addNewStudent();
			} else if (choice == 3) {
				deleteStudent();
			} else if (choice == 4){
				System.out.println("Goodbye!");
			} else {
				System.out.println("Please select a valid option!");
			}
			
		}
		
	}
	
	public static void showMenu() {
		System.out.println("1) Print students names");
		System.out.println("2) Add new student");
		System.out.println("3) Delete student at position");
		System.out.println("---------------------");
	}
	
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	
	public static void printStudentNames() {
		for (String student : students) {
			System.out.println(student);
		}
	}
	
	public static void addNewStudent() {
		System.out.print("Enter the name you would like to add.");
		String name = scanner.next();
		students.add(name);
		System.out.println("Student added: " + name);
	}
	
	public static void deleteStudent() {
		System.out.println("Enter the index of the student you would like to delete.");
		int index = getUserChoice();
		if (index < students.size()) {
			students.remove(index);
		}
	}

}
