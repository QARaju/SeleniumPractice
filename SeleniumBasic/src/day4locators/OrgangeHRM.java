package day4locators;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrgangeHRM {

	public static void main(String[] args) {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		//	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		//loginpage validation
		String pageTitle=driver.getTitle();
		System.out.println("Page title is: "+ pageTitle);
		System.out.println("Page title status: "+pageTitle.equals("OrangeHRM"));
		String pageURL=driver.getCurrentUrl();
		System.out.println("Page Url is: "+ pageURL);
		System.out.println("Page URL status is: "+pageURL.equals("https://opensource-demo.orangehrmlive.com"));
		String pageSource=driver.getPageSource();
		System.out.println("Page source length: "+pageSource.length());
		
		driver.close();
		
		
		
		
		
		

	}

}
