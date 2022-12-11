package day3assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime{

	public static void main(String[] args) {
String currentWorkingDir=System.getProperty("user.dir");
			
		String ChromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		
		//ChromeDriver cdriver=new ChromeDriver(); or
		
		//Creating an instance of Chrome Browser and upcasting it to webdriver interface.
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.actitime.com");
		String pageTitle=driver.getTitle();
		String pageUrl=driver.getCurrentUrl();
		String pageSource=driver.getPageSource();
		
		System.out.println("Page Title is: "+pageTitle);
		System.out.println("Page Title lenght is: "+pageTitle.length());
		System.out.println("Page URL is: "+pageUrl);
		String expectedUrl="https://www.actitime.com";
		System.out.println("Url validation status: "+pageUrl.contains(expectedUrl));
		//System.out.println("Page Source Code is:" +pageSource);
		System.out.println("Page Source Length is:" +pageSource.length());
		
		driver.close();
	
		
	}

}

