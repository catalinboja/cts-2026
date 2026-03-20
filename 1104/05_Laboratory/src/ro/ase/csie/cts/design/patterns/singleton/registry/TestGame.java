package ro.ase.csie.cts.design.patterns.singleton.registry;

public class TestGame {

	public static void main(String[] args) {
		
		ChannelLogger errLogger = ChannelLogger.ERROR;
		
		errLogger.log("Failed update...");
		
		ChannelLogger errLogger2 = ChannelLogger.ERROR;
		errLogger2.log("Failed DB connection...");
		
		ChannelLogger statusLogger = ChannelLogger.STATUS;
		statusLogger.log("App started ...");
		
	}

}
