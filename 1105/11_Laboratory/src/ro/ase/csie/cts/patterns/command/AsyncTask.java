package ro.ase.csie.cts.patterns.command;

public class AsyncTask extends AbstractAsyncTask{

	// params are inherited
	private int priority;
	private IModuleActions executor;
	
	public AsyncTask(String params, int priority, IModuleActions executor) {
		super();
		this.taskParams = params;
		this.priority = priority;
		this.executor = executor;
	}

	@Override
	public void executeTask() {
		System.out.println("Execute background task...");
		this.executor.doAction(this.taskParams);
	}
	
	public int getPriority() {
		return this.priority;
	}

}
