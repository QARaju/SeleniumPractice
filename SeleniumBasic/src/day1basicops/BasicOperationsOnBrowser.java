package day1basicops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperationsOnBrowser {

	public static void main(String[] args) {
	
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver", driverPath3);
		
		//ChromeDriver cdriver=new ChromeDriver(); or
		
		//Creating an instance of Chrome Browser and upcasting it to webdriver interface.
		WebDriver driver=new ChromeDriver();
		 
		driver.get("https://www.google.com");
		
		String exptectedUrl="https://www.google.com";
		
		String appCurrentUrl=driver.getCurrentUrl();
		
		System.out.println("Actual URL: "+appCurrentUrl);
		System.out.println("Expected URL: "+exptectedUrl);
		
		if(appCurrentUrl.contains("expectedUrl")) {
			System.out.println("Current URL Validation is passed");
		} else {
			System.out.println("Current URL Validation is failed");
		
		}
		
		driver.close();
	
		
		
	}

}