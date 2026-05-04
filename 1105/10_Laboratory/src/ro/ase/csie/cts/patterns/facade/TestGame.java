package ro.ase.csie.cts.patterns.facade;

public class TestGame {

	public static void main(String[] args) {
		
		GameServer gameServer = new GameServer("10.0.0.1", "BetaTesting");
		gameServer.connect();
		GameCredentials user = new GameCredentials("player1", "1234");
		GameSession session = new GameSession(gameServer, user);
		session.authenticate();
		
		
		//same thing using the facade
		GameAPI.authenticate("10.0.0.1", "player1", "1234");
		
		
	}

}
