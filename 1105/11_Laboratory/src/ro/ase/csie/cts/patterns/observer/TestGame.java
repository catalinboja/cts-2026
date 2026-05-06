package ro.ase.csie.cts.patterns.observer;

public class TestGame {

	public static void main(String[] args) {
		
		NetworkModule networkModule = new NetworkModule("10.0.0.1");
		
		INetworkActions gameClient = new GameClient("v2.1.56");
		INetworkActions gameUI = new GameUI();
		
		networkModule.register(gameUI);
		networkModule.register(gameClient);
		
		networkModule.checkConnection();
		
		networkModule.unregister(gameUI);
		
		networkModule.checkConnection();
		
	}

}
