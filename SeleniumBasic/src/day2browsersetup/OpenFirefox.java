	package day2browsersetup;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
	
		String currentWorkingDir=System.getProperty("user.dir");
		System.out.println("Current Working Dir: "+currentWorkingDir);
		
		String geckoExePath=currentWorkingDir+"\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", geckoExePath);
		
		FirefoxDriver fdriver=new FirefoxDriver();
		
		fdriver.get("http://www.google.com");
		
		fdriver.close();
		

	}

}
