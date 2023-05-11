package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleDropDown {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace"
				+ "\\NewWorkspace\\selenium\\driver\\chromedriver_win32 (1)\\chromedriver.exe" ) ;
		
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://letcode.in/dropdowns");
        
        WebElement singledrop = driver.findElement(By.id("fruits"));
        
        Select s = new Select(singledrop);
        
        s.selectByVisibleText("Banana");
        
        System.out.println("the value will be selected");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
