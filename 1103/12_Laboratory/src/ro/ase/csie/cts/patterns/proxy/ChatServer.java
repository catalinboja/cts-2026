package ro.ase.csie.cts.patterns.proxy;

public class ChatServer implements IChatServer{

	@Override
	public void sendMessage(String destination, String source, String message) {
		System.out.println(source + " -> " + destination + ": " 
					+ message);
	}
	

}
