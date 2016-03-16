import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.LinkHelper;
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
		
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='client-login-errors']/ol/li[1]")).isDisplayed());
	}
	
	
	
	
	

}
