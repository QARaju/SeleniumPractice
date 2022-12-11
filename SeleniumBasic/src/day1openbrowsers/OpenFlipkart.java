package day1openbrowsers;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFlipkart {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumBasic\\Executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		//Thread.sleep(3000);
		cdriver.get("http://www.flipkart.com");
		
		
		
		cdriver.close();

	}

}
