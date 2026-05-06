package ro.ase.csie.cts.patterns.observer;

public class GameUI implements INetworkActions{

	@Override
	public void connectionLost(Long timestamp) {
		System.out.println("Show popup: Connection lost !");
	}

	@Override
	public void connectionUp() {
		System.out.println("Show popup: Connection is live");
	}
	
}
