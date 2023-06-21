package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SampleEntry {
	// It helps us collect information about how the application is running and also helps us debug if any failure occurs.
	//Log4j gives you the ability to direct logs to different outputs. For e.g. to a file, Console or a Database.
	//Log4j consists of four main components
	/*
	 * LogManager
       Loggers
       Appenders
       Layouts
	 */
	
	//This is the static class that helps us get loggers with different names and hierarchy.
	//mainLogger is a logger object that we got from LogManager. All loggers are 
    //using this method only. We can consider LogManager as a factory to create
    //Logger objects
	static Logger mainLogger = LogManager.getLogger(SampleEntry.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		System.out.println("First");
		mainLogger.info("This is just a logger");
		mainLogger.info("This is first logger message");
		mainLogger.warn("This is warn message");
		mainLogger.fatal("This is fatal message");
		System.out.println("Last");

	}

}
