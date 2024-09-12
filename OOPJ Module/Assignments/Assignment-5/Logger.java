package Assignment;

public class Logger {
	private static Logger instance = null;
	
	private StringBuilder logMessages;
	
	private Logger() {
		logMessages = new StringBuilder();
	}

	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
		
	}
	public void log(String message) {
		logMessages.append(message);
	}
	public String getLog() {
		return logMessages.toString();
		
	}
	public void clearLog() {
		logMessages.setLength(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getInstance();
		logger.log("Starting the application");
		 System.out.println("Current log:");
		System.out.println(logger.getLog());
		logger.clearLog();
		System.out.println("Log after clearing:");
		
		System.out.println(logger.getLog());
	}

}
