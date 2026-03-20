package ro.ase.csie.cts.design.patterns.singleton.eager;

public class Logger implements ILogger{
	
	public final static Logger logger = new Logger();
	
	private Logger() {
		System.out.println("Init global logger ...");
	}

	@Override
	public void logError(String msg) {
		System.out.println("Error:" + msg);
	}

	@Override
	public void logInfo(String info) {
		System.out.println("Info: " + info);
	}
	
//	public static Logger getLogger() {
//		return logger;
//	}

}
