package ro.ase.csie.cts.patterns.facade;

// the Facade class
public class GameSimpleAPI {

	public static boolean authenticate(
			String username, String pass, String serverIP) {
		
		GameServer server = new GameServer(serverIP, "");
		UserCredentials user = new UserCredentials(username, pass);
		PlayerAuthentication auth = new PlayerAuthentication(server);
		
		return auth.checkUser(user);
	}
}
