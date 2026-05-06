package ro.ase.csie.cts.patterns.chain;

import java.util.Random;

public class AntiCheatCheck extends AbstractCheckStep {

	@Override
	public void doCheck(String playerName, int level) {
		
		System.out.println("Checking for cheating software");
		boolean hasCheatingSoftware = new Random().nextBoolean();
		
		if(hasCheatingSoftware) {
			System.out.println("Request declined !");
			return;
		} else {
			if(this.next != null ) {
				this.next.doCheck(playerName, level);
			}
		}
		
	}

}
