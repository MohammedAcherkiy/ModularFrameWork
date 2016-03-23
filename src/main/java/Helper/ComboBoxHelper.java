package Helper;

import org.openqa.selenium.support.ui.Select;

public class ComboBoxHelper extends StartWebDriver{
	
	
	
	private static Select select = null;
	
	public static void  select(String locator, int index){
		select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	
	public static void select(String locator, String value){
		select =  new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void selectLink(String locator, String visibleText){
		select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);	
	}

}
