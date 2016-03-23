package Helper;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperiesFile {
	
	protected  InputStream input  = null;
	protected Properties prop = null;
	
	
	public  ReadProperiesFile(){
		input =  ReadProperiesFile.class.getClassLoader().getResourceAsStream("Resources/config.properties");
		prop =  new Properties();
		try {
			prop.load(input);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	
	}
	 
	 public String getBrowser(){
		 if(prop.getProperty("browser") == null)
			 return "";
		 return prop.getProperty("browser");
			 
		 }
	 
	 
	 
	 public String getUrl(){
		 if(prop.getProperty("url") ==null)
		 return ""; 
		 return prop.getProperty("url");
		 
	 }
	 
	 }



	


