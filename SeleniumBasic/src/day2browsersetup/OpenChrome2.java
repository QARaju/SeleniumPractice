package day2browsersetup;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome2 {

	public static void main(String[] args) {
		
		String currentWorkingDir=System.getProperty("user.dir");
		
		System.out.println("Current Working dir: "+currentWorkingDir);
		
		String ChromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.get("http://www.google.com");		
		
		cdriver.close();
	
		
	}

}


