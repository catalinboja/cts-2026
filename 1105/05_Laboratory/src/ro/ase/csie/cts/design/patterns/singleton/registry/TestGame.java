package ro.ase.csie.cts.design.patterns.singleton.registry;

public class TestGame {

	public static void main(String[] args) {
		
		ChannelLogger errorLog = ChannelLogger.ERROR;
		errorLog.log("Game failure on update....");
		
		ChannelLogger otherErrorLog = ChannelLogger.ERROR;
		otherErrorLog.log("Security breach....");
		
		ChannelLogger infoLog = ChannelLogger.INFO;
		infoLog.log("Start update....");
		
		if(errorLog == otherErrorLog) {
			System.out.println("Same objects");
		}
	}

}
