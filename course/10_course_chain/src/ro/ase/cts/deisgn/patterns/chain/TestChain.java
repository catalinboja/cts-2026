package ro.ase.cts.deisgn.patterns.chain;

import ro.ase.cts.deisgn.patterns.chain.processors.FireAlarmProcessor;
import ro.ase.cts.deisgn.patterns.chain.processors.AbstractProcessor;
import ro.ase.cts.deisgn.patterns.chain.processors.HighPriorityProcessor;
import ro.ase.cts.deisgn.patterns.chain.processors.MaximumPriorityProcessor;
import ro.ase.cts.deisgn.patterns.chain.processors.MessageProcessor;

public class TestChain {
	public static void main(String[] args){
		AbstractProcessor mp = new MessageProcessor();
		AbstractProcessor highp = new HighPriorityProcessor();
		AbstractProcessor maxp = new MaximumPriorityProcessor();
		AbstractProcessor firep = new FireAlarmProcessor();
		
		maxp.setSuccessor(highp);
	
		highp.setSuccessor(mp);
		firep.setSuccessor(maxp);
		
		Message m1 = new Message("Fire alarm !",200);
		Message m2 = new Message("Open door at office 302 !",50);
		Message m3 = new Message("Security test !",78);
		
		firep.manageRequest(m1);
		firep.manageRequest(m2);
		firep.manageRequest(m3);
		
	}
}
