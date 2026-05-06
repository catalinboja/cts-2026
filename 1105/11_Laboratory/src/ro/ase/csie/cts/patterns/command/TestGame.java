package ro.ase.csie.cts.patterns.command;

public class TestGame {

	public static void main(String[] args) {
		
		TasksManager manager = new TasksManager();
		
		IModuleActions backupModule = new BackupModule("v.2.4.12");
		IModuleActions updateModule = new UpdateModule("10.0.0.1", "v2.4.12");
		
		//create some background async tasks
		AbstractAsyncTask backupTask = 
				new AsyncTask("Local storage", 100, backupModule);
		manager.addTask(backupTask);
		
		AbstractAsyncTask updateTask = 
				new AsyncTask("3d models", 10, updateModule);
		manager.addTask(updateTask);
		
		
		//simulate executing the tasks
		manager.executeNextTask();
		manager.executeNextTask();
		
		
		
	}

}
