package ro.ase.csie.cts.patterns.chain;

public class LevelCheck extends AbstractCheckStep {
	
	private int miniumRequiredLevel;

	public LevelCheck(int miniumRequiredLevel) {
		super();
		this.miniumRequiredLevel = miniumRequiredLevel;
	}

	@Override
	public void doCheck(String playerName, int level) {
		System.out.println("Check required level of " + this.miniumRequiredLevel );
		if(level >= this.miniumRequiredLevel) {
			System.out.println("You can join the match....");
			return;
		} else {
			System.out.println("Play more. Request declined !");
		}
	}
	
	

}
