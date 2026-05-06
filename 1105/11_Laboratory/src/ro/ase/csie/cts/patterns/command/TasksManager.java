package ro.ase.csie.cts.patterns.command;

import java.util.ArrayList;

public class TasksManager {
	
	ArrayList<AbstractAsyncTask> futureTasks = new ArrayList<>();
	
	public void addTask(AbstractAsyncTask task) {
		this.futureTasks.add(task);
	}
	
	public void executeNextTask() {
		if(this.futureTasks.size() > 0) {
			//use a FIFO principle
			AbstractAsyncTask nextTask = futureTasks.get(0);
			System.out.println("Executing next task with priority " + 
					((AsyncTask)nextTask).getPriority());
			nextTask.executeTask();
			this.futureTasks.remove(nextTask);
		}
	}
	
}
