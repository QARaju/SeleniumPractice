package day7propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmPagi {

	public static void main(String[] args) throws InterruptedException {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/tecno-phones-120.php");
		List<WebElement> paginationLinks=driver.findElements(By.cssSelector(".nav-pages>a"));
		if (paginationLinks.size()>0) {
			System.out.println("Pagination exist");
		}else {
			System.out.println("Pagination not exist");
		}
		//print links
		for (WebElement element:paginationLinks) {
			System.out.println(element.getText());
		}
		
		//every page url
		for (int i=0; i<paginationLinks.size();i++) {
			System.out.println(driver.getCurrentUrl());
			paginationLinks.get(i).click();
			Thread.sleep(2000);
			paginationLinks=driver.findElements(By.cssSelector(".nav-pages>a"));
		}

	}

}
