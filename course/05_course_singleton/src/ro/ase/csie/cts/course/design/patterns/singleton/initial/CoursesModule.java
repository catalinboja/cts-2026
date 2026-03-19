package ro.ase.csie.cts.course.design.patterns.singleton.initial;

public class CoursesModule {
	
	
	public CoursesModule(DBConnection connection) {
		
		DBConnection db2ndConnection = new DBConnection( "127.0.0.1", 3306,
		"university");
		
		connection.connect();
	}
}
