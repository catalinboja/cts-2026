package ro.ase.csie.cts.patterns.facade;

import java.util.Random;

public class GameSession {
	
	GameServer server;
	GameCredentials credentials;
	
	public GameSession(GameServer server, GameCredentials credentials) {
		super();
		this.server = server;
		this.credentials = credentials;
	};
	
	public boolean authenticate() {
		System.out.println("Authenticating....");
		return new Random().nextBoolean();
	}
	
	
	
}
