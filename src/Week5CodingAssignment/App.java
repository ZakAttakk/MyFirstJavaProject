package Week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Logger logger1 = new AsteriskLogger();
		
		logger1.log("test");
		logger1.error("test");
		
		Logger logger2 = new SpacedLogger();
		
		logger1.log("test");
		logger2.error("test");

	}

}
