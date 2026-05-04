package ro.ase.cts.deisgn.patterns.chain.processors;

import ro.ase.cts.deisgn.patterns.chain.Message;

public class HighPriorityProcessor extends AbstractProcessor{
	public void manageRequest(Message msg)
	{
		if (msg.getPriority() > 50 && msg.getPriority() <= 100){
			System.out.println("\n Message with high priority: "+msg.getText());
		}
		else{
			if(this.succesor!=null)
				this.succesor.manageRequest(msg);
		}
	}
}
