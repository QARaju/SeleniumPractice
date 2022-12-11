package day7propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Actitime {

	public static void main(String[] args) {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String pageTitle=driver.getTitle();
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+ pageTitle.length());
		String expectedTitle="actiTIME - Login";
		//validation login page
		System.out.println("Title validation status: "+pageTitle.equals(expectedTitle));
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page url is: "+pageUrl);
		String expectedURL="https://demo.actitime.com";
		//validating login page
		System.out.println("URL validation status: "+pageUrl.contains(expectedURL));
		
		String pageSource=driver.getPageSource();
		System.out.println("Page source: "+pageSource);
		System.out.println("Page Source Length: "+pageSource.length());
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.cssSelector("input[type='password']"));
		passwordInputField.clear();
		passwordInputField.sendKeys("manager");
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		driver.findElement(By.cssSelector("a[class='content tasks]")).click();
		
		//driver.close();
		
		
		
		
		
		
	}

}
