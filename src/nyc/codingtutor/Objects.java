package nyc.codingtutor;

import java.util.Arrays;
import java.util.Scanner;

public class Objects {

	public static void main(String[] args) {
		
		int[] numbers = {3, 4, 2};
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
		
		String name = "Zach";
		
		System.out.println(name.length());
		
		Scanner s = new Scanner(System.in);
		
		String test = "test";
		test = "new";
		System.out.println(test);
		
		s.close();
	}

}
