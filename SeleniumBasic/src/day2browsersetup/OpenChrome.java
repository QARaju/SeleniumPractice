package day2browsersetup;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				".\\Executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.get("http://www.google.com");		
		
		cdriver.close();
	
		
	}

}


