package ro.ase.csie.cts.patterns.observer;

import java.util.ArrayList;
import java.util.Random;

public class NetworkModule {
	
	private boolean isOnline;
	private String serverIP;
	
	ArrayList<INetworkActions> observers = new ArrayList<>();
	
	public NetworkModule(String serverIP) {
		this.serverIP = serverIP;
		this.isOnline = false;
	}
	
	//register/subscribe
	public void register(INetworkActions observer) {
		this.observers.add(observer);
	}
	
	public void unregister(INetworkActions observer) {
		this.observers.remove(observer);
	}
	
	public void checkConnection() {
		System.out.println("Checking connection to " + this.serverIP);
		this.isOnline = new Random().nextBoolean();
		if(this.isOnline) {
			for(INetworkActions observer : this.observers) {
				observer.connectionUp();
			}
		} else {
			for(INetworkActions observer : this.observers) {
				observer.connectionLost(System.currentTimeMillis());
			}
		}
	}
	
}
