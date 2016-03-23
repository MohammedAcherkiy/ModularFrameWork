package Helper;

import org.openqa.selenium.Alert;

public class AlertHelper extends StartWebDriver {
	
	
	private static Alert alert =null;
	
	
	
	public static void clickOK(){
		alert = driver.switchTo().alert();
		alert.accept();	
	}
	
	
	
	public static void clickCancel(){
		alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	
	public static String getText(){
	 alert = driver.switchTo().alert();
	 return alert.getText();
			
	}
	
	
	public static void typeValue(String value){
		alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}
 
}
