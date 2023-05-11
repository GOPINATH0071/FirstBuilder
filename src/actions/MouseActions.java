package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
       public static void main(String[] args) {
		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace\\"
    			+ "NewWorkspace\\selenium\\driver\\chromedriver.exe")   ;
    	   
    	   
    	  WebDriver driver = new ChromeDriver(); 
    	  
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.get("https://www.amazon.in/")	;   
    	 WebElement actions = driver.findElement(By.id("icp-nav-flyout"));
    	 Actions ac = new Actions(driver);
    	 ac.moveToElement(actions).build().perform();
    	 ac.click(actions).build().perform();
    	 WebElement language = driver.findElement(By.xpath("//i[@class='a-icon a-icon-radio']"));
    	 ac.click(language).build().perform();
    	 System.out.println("language will be selected");
    	 
    	 
    	   
    	   
    	   
    	   
    	   
    	   
    	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
