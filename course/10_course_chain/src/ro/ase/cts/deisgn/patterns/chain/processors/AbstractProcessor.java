package ro.ase.cts.deisgn.patterns.chain.processors;

import ro.ase.cts.deisgn.patterns.chain.Message;

public abstract class AbstractProcessor {
	protected AbstractProcessor succesor = null;
	
	public void setSuccessor(AbstractProcessor succesor){
		this.succesor = succesor;
	}

	public abstract void manageRequest(Message msg);
}
