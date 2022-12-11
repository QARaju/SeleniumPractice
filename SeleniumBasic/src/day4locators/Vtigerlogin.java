package day4locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigerlogin {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String ChromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver raaj1=new ChromeDriver();
		
		raaj1.get("https://demo.vtiger.com/vitegercrm/index.php");
		//Ideantify username
		WebElement username=raaj1.findElement(By.id("username"));
		
		//perform required operation in the username field
		username.clear();
		username.sendKeys("admin");
		
		//Ideantify password field
				WebElement pwd=raaj1.findElement(By.name("password"));
				
				//perform required operation in the username field
				pwd.clear();
				pwd.sendKeys("Test@123");
				
				//identifying sign in button
				WebElement SignInButton=raaj1.findElement(By.className("buttonBlue"));				
				//perform required operation in the username field
				SignInButton.click();
				
		
		 
		raaj1.close();
		
		

	}

}
