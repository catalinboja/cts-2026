package ro.ase.csie.cts.patterns.chain;

public abstract class AbstractCheckStep {
	
	protected AbstractCheckStep next;
	
	public void setNextStep(AbstractCheckStep nextStep) {
		this.next = nextStep;
	}
	
	public abstract void doCheck(String playerName, int level);
	
}
