package day2browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenFirefox {

	public static void main(String[] args) {
		
		String currentWorkingDir=System.getProperty("user.dir");
		
		String FirefoxExePath=currentWorkingDir+"\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", FirefoxExePath);
				
				WebDriver driver=new FirefoxDriver();
				
			   driver.get("http://www.google.com");
						
						driver.close();
						
		

	}

}
