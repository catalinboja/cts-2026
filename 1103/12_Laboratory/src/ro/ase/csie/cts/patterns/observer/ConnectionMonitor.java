package ro.ase.csie.cts.patterns.observer;

import java.util.ArrayList;

public class ConnectionMonitor {
	ArrayList<ILostConnectionNotification> observers  
		= new ArrayList<>();
	
	public void subscribe(ILostConnectionNotification observer) {
		this.observers.add(observer);
	}
	
	public void unsubscribe(ILostConnectionNotification observer) {
		this.observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(ILostConnectionNotification observer : observers) {
			observer.notify(System.currentTimeMillis());
		}
	}
	
}
