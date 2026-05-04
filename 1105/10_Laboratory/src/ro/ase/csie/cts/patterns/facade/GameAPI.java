package ro.ase.csie.cts.patterns.facade;

public class GameAPI {
	
	public static boolean authenticate(
			String serverIp, String user, String pass) 
	{
		GameServer server = new GameServer(serverIp, "");
		server.connect();
		GameCredentials credentials = new GameCredentials(user, pass);
		GameSession session = new GameSession(server, credentials);
		return session.authenticate();
	}
	
}
