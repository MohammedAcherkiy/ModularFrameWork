import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.LinkHelper;
import Helper.ScreenShotHelper;
import Helper.StartWebDriver;
import Helper.TextBoxHelper;

public class testBrowserSetUp extends StartWebDriver {
	
	
	
	@Test
	public void testBrowserConfiguration() throws InterruptedException{
		
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
	
		WebElement ele =  driver.findElement(By.id("jawbone-login-trigger"));
		ele.click();
     	TextBoxHelper.TypeInTextBox("jawbone-login-email","ach251@gmail.com" );
		TextBoxHelper.TypeInTextBox("jawbone-login-pass", "12345");
		WebElement ele2 =  driver.findElement(By.id("jawbone-login-form-button"));
		ele2.click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='client-login-errors']/ol/li[1]")).isDisplayed());
	
	try{
		throw new FileNotFoundException();
		
	}catch(FileNotFoundException e){
		ScreenShotHelper.takeScreenShot(this.getClass().toString());
		Assert.fail(e.toString());
		
	}
	
	}
	
	
	
	
	
	
	
	

}
