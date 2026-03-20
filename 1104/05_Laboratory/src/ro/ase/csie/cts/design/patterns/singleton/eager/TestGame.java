package ro.ase.csie.cts.design.patterns.singleton.eager;

public class TestGame {

	public static void main(String[] args) {
		
		Logger logger1 = Logger.logger;
		Logger logger2 = Logger.logger;
		
		if(logger1 == logger2) {
			System.out.println("Same logger");
		}
		
	}

}
