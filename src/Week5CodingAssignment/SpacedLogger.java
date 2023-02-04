package Week5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String string) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			result.append(string.charAt(i));
			if (i != string.length()-1) {
				result.append(" ");
			}
		}
		System.out.println("***" + result + "***");
		
	}

	@Override
	public void error(String string) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			result.append(string.charAt(i));
			if (i != string.length()-1) {
				result.append(" ");
			}
		}
		System.out.println("ERROR: *** " + result + " ***");
		
	}
	
}
