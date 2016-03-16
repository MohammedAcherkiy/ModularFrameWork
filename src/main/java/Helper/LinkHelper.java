package Helper;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

public class LinkHelper  extends StartWebDriver{
	
	public static void clickLink(String locator){
		
		if(driver.findElements(By.linkText(locator)).size()==1){
			driver.findElement(By.linkText(locator)).click();
		}else if (driver.findElements(By.partialLinkText(locator)).size()==1){
			driver.findElement(By.partialLinkText(locator)).click();
		}throw new NoSuchElementException("No Such Element " + locator);
		
	}

}
