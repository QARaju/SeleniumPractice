package day7propertyfile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaSamsungPhoneNames {

	public static void main(String[] args) {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		
		List<WebElement> deviceNames=driver.findElements(By.cssSelector("ul>li>a>strong>span"));
		System.out.println("Device count: "+deviceNames.size());
		for(int i=0;i<deviceNames.size();i++) {
		System.out.println(deviceNames.get(i).getText());
		

	}

}
}