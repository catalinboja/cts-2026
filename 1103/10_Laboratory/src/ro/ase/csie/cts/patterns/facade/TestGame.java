package ro.ase.csie.cts.patterns.facade;

public class TestGame {

	public static void main(String[] args) {
		
		//authenticate an user
		GameServer server = new GameServer("10.0.0.1", "Beta testing");
		UserCredentials user = new UserCredentials("demo", "1234");
		PlayerAuthentication auth = new PlayerAuthentication(server);
		if(auth.checkUser(user))
		{
			System.out.println("User authenticated");
		}
		
		// same thing with the facade
		
		if(GameSimpleAPI.authenticate("demo", "1234", "10.0.0.1")) {
			System.out.println("User authenticated");
		}
	}

}
