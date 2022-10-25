package nyc.codingtutor;

public class MoreMethods {

	public static void main(String[] args) {
//		int nmbrs[] = {1, 2, 3};
//		System.out.println(sumArray(nmbrs)); 
		
		double measurements[] = {3.45, 23.565, 22.3, 34};
		System.out.println(averageArray(measurements));
		
		System.out.println(repeatWord("Zach", 5));
	}
	
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	public static double averageArray(double[] numbers) {
		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}
		return sum / numbers.length;
	}
	
	public static String repeatWord(String word, int number) {
		String repeatedWord = "";
		for (int i = 0; i < number; i++) {
			repeatedWord += word;
		}
		return repeatedWord;
	}

}
