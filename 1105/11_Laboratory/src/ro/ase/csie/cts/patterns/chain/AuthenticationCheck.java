package ro.ase.csie.cts.patterns.chain;

import java.util.Random;

public class AuthenticationCheck extends AbstractCheckStep{

	@Override
	public void doCheck(String playerName, int level) {
		System.out.println("Check credentials for " + playerName);
		boolean isAuthenticated = new Random().nextBoolean();
		
		if(!isAuthenticated) {
			System.out.println("Authentication failed !!!!");
			return;
		} else {
			if(this.next != null) {
				this.next.doCheck(playerName, level);
			}
		}
		
	}

}
