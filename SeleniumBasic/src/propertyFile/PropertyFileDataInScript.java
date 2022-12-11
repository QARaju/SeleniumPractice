package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileDataInScript {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\TestData\\AppData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String driverKey=prop.getProperty("driverKey");
		String ExecutablesPath=prop.getProperty("driveExecutablesPath");
		String applicationUrl=prop.getProperty("appUrl");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		String expectedLoginPageTitle=prop.getProperty("expectedLoginPageTitle");
		String loginButton=prop.getProperty("loginButton");
		
		String chromeExePath=System.getProperty("user.dir")+ExecutablesPath;
		System.setProperty(driverKey, chromeExePath);
		//creating an instance of chrome browser and up casting it to webdriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of webdriver interface
		driver.get(applicationUrl);
		//to get title from the application use getTitle() of webdriver interface
		String pageTitle=driver.getTitle();
		System.out.println("Page Title is: "+pageTitle);
		System.out.println("Page title length is: "+pageTitle.length());
		//validation login page
		System.out.println("Title validation status: "+pageTitle.equals(expectedLoginPageTitle));
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page Url is: "+pageUrl);
		//validating login page
		System.out.println("Url validation statuts: "+pageTitle.equals(expectedLoginPageTitle));
		String pageSource=driver.getPageSource();
		System.out.println("Page source: "+pageSource);
		System.out.println("Page source lenth: "+pageSource.length());
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("manager");
		
		//driver.close();
	
		
		
		
		
		
		
		
		
		
		
	}

}
