package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorspratice {

	
	public static void idandname() {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace"
			+ "\\NewWorkspace\\selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	WebElement username = driver.findElement(By.id("email"));
	
	username.sendKeys("7904884713");
	
	WebElement password = driver.findElement(By.id("pass"));
	
	password.sendKeys("Mechanical@23");
	
	WebElement loginButton = driver.findElement(By.name("login"));
	

	loginButton.click();
	
	}
	public static void main (String[] args) {
		
	idandname();
	
	}
	
	
}
