import org.testng.annotations.Test;

import Helper.StartWebDriver;

public class testBrowserSetUp extends StartWebDriver {
	
	
	
	@Test
	public void testBrowserConfiguration(){
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
	}
	
	
	
	
	

}
