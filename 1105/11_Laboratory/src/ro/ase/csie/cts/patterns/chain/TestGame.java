package ro.ase.csie.cts.patterns.chain;

public class TestGame {

	public static void main(String[] args) {
		
		//create the chain
		AbstractCheckStep authStep = new AuthenticationCheck();
		AbstractCheckStep antiCheatStep = new AntiCheatCheck();
		AbstractCheckStep levelCheck = new LevelCheck(30);
		
		authStep.setNextStep(antiCheatStep);
		antiCheatStep.setNextStep(levelCheck);
		
		//process some requests
		authStep.doCheck("John", 10);
	}

}
