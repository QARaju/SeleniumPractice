package day7propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//use get () to get url
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium interview questions");
		Thread.sleep(2000);
		//get all suggestions
		List<WebElement>sugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-tyep(02)>*:first-child>span"));
		//suggestion count
		System.out.println("Suggestion count: "+sugg.size());
		//print suggestions in the console
		for (int i=0;i<sugg.size();i++) {
			WebElement element=sugg.get(i);
			System.out.println(element.getText());
			//or
			//sysout(sugg.get(i).getText());
		}
		

	}

}

