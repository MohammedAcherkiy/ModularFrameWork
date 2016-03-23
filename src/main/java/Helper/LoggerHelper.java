package Helper;

import java.io.IOException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class LoggerHelper {
	
	
	private static PatternLayout layout = null;
	private static ConsoleAppender console = null;
	private static RollingFileAppender rolling = null;
	private static Logger rootLogger =null;
	private static Logger logger = null;
	private static final String pattern = "%d{yyyy-MM-dd HH:mm:ss} %-5p %c : %L - [%M] %m%n";
	private static Boolean flag =false;
	
	
	public static void initLogger(){
		
		layout = new PatternLayout(pattern);
		
		//ConsoleAppender
		console =  new ConsoleAppender(layout);
		console.setName("STDOUT");
		console.setTarget("System.out");
		console.setThreshold(Level.INFO);
		console.activateOptions();
	
		//RollingFileAppender
		try{
		rolling =  new RollingFileAppender(layout, "Selenium/log4g.log");
		rolling.setName("RFILE");
		rolling.setMaxFileSize("25MB");
		rolling.setMaxBackupIndex(100);
		rolling.setThreshold(Level.INFO);
		rolling.activateOptions();
		
	}catch(IOException e){
		e.printStackTrace();
	}	
		rootLogger =  Logger.getRootLogger();
		rootLogger.addAppender(console);
		rootLogger.addAppender(rolling);
}
	
	public static Logger getLogger(Class aClass){
		
		if(!flag){
			initLogger();
		flag =true;
		LoggerHelper.logger = Logger.getLogger(aClass);
		return LoggerHelper.logger;
		}else{
			LoggerHelper.logger = Logger.getLogger(aClass);
			return LoggerHelper.logger;
			
			
		}
			
	}
	
	
}
