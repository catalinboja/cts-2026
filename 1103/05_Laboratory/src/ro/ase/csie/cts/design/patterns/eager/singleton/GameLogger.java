package ro.ase.csie.cts.design.patterns.eager.singleton;

import ro.ase.csie.cts.design.patterns.interfaces.ILogging;

public class GameLogger implements ILogging{
	
	private static GameLogger logger = new GameLogger();
	
	private String fileName;
	
	private GameLogger() {
		System.out.println("Creating the game log file: game.log");
		this.fileName = "game.log";
	}
	
	public static synchronized GameLogger getLogger() {
		return GameLogger.logger;
	}

	@Override
	public void logInfo(String info) {
		System.out.println("Log into the file INFO: " + info);
	}

	@Override
	public void logError(String error) {
		System.out.println("Log into the file ERROR:" + error);
	}

}
