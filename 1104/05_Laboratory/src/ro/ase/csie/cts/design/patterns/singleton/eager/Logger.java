package ro.ase.csie.cts.design.patterns.singleton.eager;

public class Logger implements ILogging{
	
	public final static Logger logger = new Logger();
	
	private Logger() {
		System.out.println("Creating global logger...");
	}

	@Override
	public void logError(String error) {
		System.out.println("ERROR:" + error);
	}

	@Override
	public void logInfo(String info) {
		System.out.println("INFO:" + info);
	}
	
//	public static Logger getLogger() {
//		return logger;
//	}

}
