package ro.ase.csie.cts.patterns.observer;

public class GameClient implements INetworkActions{

	private String version;
	
	public GameClient(String version) {
		this.version = version;
	}

	@Override
	public void connectionLost(Long timestamp) {
		System.out.println("Backup game data...");
	}

	@Override
	public void connectionUp() {
		System.out.println("Sync game data...");
	}
}
