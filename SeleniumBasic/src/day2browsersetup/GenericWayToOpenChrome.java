package day2browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChrome {

	public static void main(String[] args) {
String currentWorkingDir=System.getProperty("user.dir");
			
		String ChromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		
		//ChromeDriver cdriver=new ChromeDriver(); or
		
		//Creating an instance of Chrome Browser and upcasting it to webdriver interface.
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");		
		
		driver.close();
	
		
	}

}

