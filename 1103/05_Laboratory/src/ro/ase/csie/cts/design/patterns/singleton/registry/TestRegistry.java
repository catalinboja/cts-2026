package ro.ase.csie.cts.design.patterns.singleton.registry;

public class TestRegistry {

	public static void main(String[] args) {

		ChannelLogger errorLog1 = ChannelLogger.ERROR;
		ChannelLogger errorLog2 = ChannelLogger.ERROR;
		
		ChannelLogger infoLog1 = ChannelLogger.INFO;
		
		errorLog1.log("Login error");
		errorLog2.log("Update error");
		
		if(errorLog1 == errorLog2) {
			System.out.println("Same logs");
		}
		
		infoLog1.log("Game server restart");
		
	}

}
