package day2browsersetup;



import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {

	public static void main(String[] args) {
		
		String currentWorkingDir=System.getProperty("user.dir");
		
		System.out.println("Current Working dir: "+currentWorkingDir);
		
		String ChromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.get("http://www.flipkart.com");	
		
		String pageTitle=cdriver.getTitle();
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestryle, Books()";
		System.out.println("Title Validation: "+pageTitle.equals(expectedTitle));
		String pageUrl=cdriver.getCurrentUrl();
		String expectedUrl="http://www.flipkart.com";
		cdriver.close();
		
		
		
		cdriver.close();
	
		
	}

}


