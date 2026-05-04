package ro.ase.csie.cts.patterns.observer;

public class GameUI implements ILostConnectionNotification{

	@Override
	public void notify(long timestamp) {
		System.out.println("Show popup: Lost connection");
	}

}
