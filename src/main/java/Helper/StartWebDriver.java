package Helper;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class StartWebDriver {
	

	public static WebDriver driver = null;
	
	
	
	@BeforeSuite()
	public void SetUp(){
		
		try{
		     ReadProperiesFile  file =  new ReadProperiesFile();
		     if("firefox".equalsIgnoreCase(file.getBrowser())){
		    	 driver =  new FirefoxDriver();
		     }else if ("chrome".equalsIgnoreCase(file.getBrowser())){
		    	 System.setProperty("webdriver.chrome.driver","/Users/mohammedacherkiy/downloads/chromedriver");
		    	 driver =  new ChromeDriver();
		     }else{
		    	 driver =  new SafariDriver();
		     
		     }
		     
		     driver.get(file.getUrl());
			
		}catch(Exception  e ){
			e.printStackTrace();
		}
		
		
		
		
	}
	
	@AfterSuite(alwaysRun =true)
	public void TearDown(){
		try{
			driver.close();
			driver.quit();
			if(driver !=null)
				driver =null;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	
	
	
	

}
