package ro.ase.csie.cts.patterns.observer;

public class GameClient implements ILostConnectionNotification{

	@Override
	public void notify(long timestamp) {
		System.out.println("Backing up game status and data");
	}

}
