import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Helper.LoggerHelper;

public class LoggerClassTest {

	private static Logger logger =  LoggerHelper.getLogger(LoggerClassTest.class);
	
	
	@Test
	public void test(){
		
		System.out.println("logging info");
		logger.info("info");
		System.out.println("logging info");
		logger.info("info");
		System.out.println("logging info");
		logger.info("info");
		System.out.println("logging info");
		logger.info("info");
		
		
	}
	
	
}
