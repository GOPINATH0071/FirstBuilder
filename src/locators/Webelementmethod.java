package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementmethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace"
				+ "\\NewWorkspace\\selenium"
				+ "\\driver\\chromedriver.exe" ) ;
		
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/login/");
        
        WebElement login = driver.findElement(By.name("login"));
        
        boolean  displayed= login.isDisplayed();
        System.out.println(displayed);
        
        boolean enabled = login.isEnabled();
        System.out.println(enabled);
        
        boolean selected = login.isSelected();
        System.out.println(selected);
        
        login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
