package ro.ase.csie.cts.patterns.facade;

import java.util.Random;

public class PlayerAuthentication {
	GameServer server;

	public PlayerAuthentication(GameServer server) {
		super();
		this.server = server;
	}
	
	public boolean checkUser(UserCredentials userData) {
		System.out.println("Connect to game server at ip " + server.getIP());
		System.out.println("Check credentials for " + userData.getName());
		return new Random().nextBoolean();
	}
}
