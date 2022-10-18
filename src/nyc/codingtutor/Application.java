package nyc.codingtutor;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		// 2 types of data: primitive and objects
		//		
		//		Primitive types:
		// int - an integer
		// double - decimal places
		// float - precision decimal data type
		// long - like an int, but number can be higher
		// short - like an int, less of a number range
		// byte - a very little amount of data (8 bits) (A bit is just 0 or 1)
		// char - a single character
		// boolean - true or false

		// Objects:
		// Strings - textual data

		// variable declaration - type identifier, assignment operator, value itself, semicolon
		
//		int numberOfFriends;
//		int age = 67;
//		double accountBalance = 34.67;
//		char middleInitial = 'J';
//		boolean isHotOutside = true;
//		String firstName = "Zachary";
//		System.out.println(age);
//		System.out.println(accountBalance);
//		System.out.println(middleInitial);
//		System.out.println(isHotOutside);
//		System.out.println(firstName);
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter you name: ");
		String name = sc.nextLine();
		
		System.out.println("Welcome " + name);
		
		int selection = 0;
		double total = 0;
		while (selection != 4) {
			System.out.println("Select an option: ");
			System.out.println("1) Candybar, $1.99");
			System.out.println("2) Cheese, $6.95");
			System.out.println("3) Soccer ball, $12.99");
			System.out.println("4) CHECKOUT");
			
			selection = sc.nextInt();
			
			
			switch (selection) {
				case 1:
					total += 1.99;
					break;
				case 2:
					total += 6.95;
					break;
				case 3:
					total += 12.99;
					break;
				case 4:
					break;
				default:
					System.out.println("Please pick a valid option.");
					
			}
			System.out.println("Your total is: " + total);
		}
		
		
	}

}
