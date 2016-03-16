package Helper;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBoxHelper  extends StartWebDriver{
	
	
	public static void TypeInTextBox(String locator, String value){
		
		WebElement ele = getElement(locator);
		ele.sendKeys(value);	
	}
	
	
	
	
	
	}


