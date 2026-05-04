package ro.ase.cts.deisgn.patterns.chain.processors;

import ro.ase.cts.deisgn.patterns.chain.Message;

public class MessageProcessor extends AbstractProcessor{
	public void manageRequest(Message msg)
	{
		if (msg.getPriority() <= 50){
			System.out.println("\n Message: "+msg.getText());
		}
	}
}
