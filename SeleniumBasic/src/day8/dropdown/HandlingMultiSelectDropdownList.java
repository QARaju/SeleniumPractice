package day8.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdownList {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//identify dropdown list 
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		
		//create an instance of select class and pass above element into it's constructor
		Select selectSkill=new Select(carDropdown);
		
		//check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		
		//get default or already seleted option
		
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
		
		
		//get option count
		List<WebElement>options=selectSkill.getOptions();
		System.out.println("Option count is: "+options.size());
		
		//get dropdown option names
		for (int i=0; i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText() );
		}
		
		//select options from dropdown
		selectSkill.selectByIndex(4);
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
		//or
		
		selectSkill.selectByValue("Backup Management");
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
		//or
		selectSkill.selectByVisibleText("Analytics");
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
		
		
		
		

	}

}
