package ro.ase.csie.cts.patterns.proxy;

public class ChatServer implements IChatServer{

	@Override
	public void sendMessage(String author, String destination, String message) {
		System.out.println(
				String.format("%s -> %s: %s", author, destination, message));
		
	}

}
