package day8.dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTaskValidation {

	public static void main(String[] args) {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("manager");
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.cssSelector(".addNewButton")).click();
		
		driver.findElement(By.cssSelector("createNewTask")).click();
		
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		
		driver.findElement(By.cssSelector("projectSelector .searchItemList>*:nth-child(4)")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Enter Task Name']")).sendKeys("Testing");
		
		//task validation
		
		List<WebElement> taskNames=driver.findElements(By.cssSelector(".taskRowTable .names .title"));
		//create a list to store all the task coming from UI
		List<String> taskList=new ArrayList<String>();
		//using for loopt tryong to add one by one task name in collection
		
		for(WebElement take: taskNames) {
			
			taskList.add(task.getText()); 
		}
		//validate task list is having newly created task or not 
		
		System.out.println(taskList.contains("3D modelling"));
		
		

	}

}
