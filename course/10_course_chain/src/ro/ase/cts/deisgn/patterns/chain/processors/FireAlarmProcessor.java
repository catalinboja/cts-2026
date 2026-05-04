package ro.ase.cts.deisgn.patterns.chain.processors;

import ro.ase.cts.deisgn.patterns.chain.Message;

public class FireAlarmProcessor extends AbstractProcessor{

	@Override
	public void manageRequest(Message msg) {
		if(msg.getText().toLowerCase().contains("fire")) {
			System.out.println("Calling fire department ....");
		}
		if(this.succesor!=null) {
			this.succesor.manageRequest(msg);
		}
	}

}
