package day3assignments;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		String currentWorkingDir=System.getProperty("user.dir");
		String ChromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver raaj=new ChromeDriver();
		
		raaj.get("hhtps://www.facebook.com");
		
		String pageTitle=raaj.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		
		System.out.println("Page Title Validation: "+pageTitle.equals(expectedTitle));
		System.out.println("Page Title: "+pageTitle);
		
		raaj.close();
		

	}

}
