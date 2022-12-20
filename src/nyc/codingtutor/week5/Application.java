package nyc.codingtutor.week5;

public class Application {
	
//	static Logger logger;

	public static void main(String[] args) {

//		Logger logger = new ConsoleLogger();
		
		Logger logger = new FileLogger();
		
		logger.info("Hello");
		logger.warning("This is a a warning");
		logger.error("Oops, this is an error");
		logger.fatal("Fatal error");
		
		logger.close();
		
//		setLogger(new FileLogger());
//		setLogger(new ConsoleLogger());
		
		
	}
	
//	private static void setLogger(Logger l) {
//		logger = l;
//	}

}
