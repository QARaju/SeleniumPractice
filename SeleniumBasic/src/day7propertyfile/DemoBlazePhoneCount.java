package day7propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazePhoneCount {

	public static void main(String[] args) {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement> deviceNames=driver.findElements(By.cssSelector("div#tbodyid h4>a"));
		List<WebElement> devicePrice=driver.findElements(By.cssSelector("div#tbodyid h5"));
		for(int i=0; i<deviceNames.size();i++) {
			System.out.println(deviceNames.get(i).getText()+": "+devicePrice.get(i).getText());
			driver.close();
		}

	}

}

