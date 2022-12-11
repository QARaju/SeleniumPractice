package day1openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\eclipse-workspace\\SeleniumBasic\\Executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.get("http://www.google.com");		
		
		//cdriver.close();
	
		
	}

}


