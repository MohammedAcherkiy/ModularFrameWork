package Helper;

import java.util.ArrayList;
import java.util.List;

public class WindowHelper extends StartWebDriver {
	
	
	public static void switchWindow(int index){
		
		try{
		List<String>win = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(win.get(index));
		}catch(IndexOutOfBoundsException e){
			
	 	throw new IndexOutOfBoundsException ("Invalid index " + index);
	 	
		}
		
		
	}

}
