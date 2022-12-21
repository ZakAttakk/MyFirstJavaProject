package Week5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String string) {
		System.out.println("***" + string + "***");
		
	}

	@Override
	public void error(String string) {
		System.out.println("********\n ERROR: " + string + "\n********");
		
	}
	
}
