package ro.ase.csie.cts.patterns.observer;

public class TestGame {

	public static void main(String[] args) {
		
		ILostConnectionNotification gameUI = new GameUI();
		ILostConnectionNotification gameClient = new GameClient();
		
		ConnectionMonitor monitor = new ConnectionMonitor();
		
		monitor.subscribe(gameClient);
		monitor.subscribe(gameUI);
		
		monitor.notifyObservers();
		
		monitor.unsubscribe(gameClient);
		monitor.notifyObservers();
		
	}

}
