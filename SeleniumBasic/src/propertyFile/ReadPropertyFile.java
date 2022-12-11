package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
	//file name and location - Absolute path
		String filePath= System.getProperty("user.dir")+"\\Propertyfiles\\DemoProp.properties";
		
		System.out.println("Current Dir: "+ filePath);
		
		//OR
		
		FileInputStream fis1=new FileInputStream(filePath);
		
		//or relative path
		FileInputStream fis2=new FileInputStream(".\\\\Propertyfiles\\\\DemoProp.properties");
		
		//create an instance of properties class
		Properties prop=new Properties();
		//load property file using load() of properties class
		prop.load(fis2);
		//read data from property file using getProperty (String key)
		System.out.println("First Name: "+prop.getProperty("firstname"));
		System.out.println("First Name: "+prop.getProperty("lastname"));
		System.out.println("First Name: "+prop.getProperty("emailId"));
		System.out.println("First Name: "+prop.getProperty("mobilenumber"));
		
		/*To write content into the file use setProperty()
		prop.setProperty("Subject1", "Selenium-Automation");
		prop.setProperty("Subject2", "QTP-Automation");
		Location where you want to */		
		

	}

}
