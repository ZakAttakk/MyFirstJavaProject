package nyc.codingtutor;

public class StringAndStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(multiplyString("Hi", 3));
		
		System.out.println(fullName.charAt(5));
	}
	
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}

}
