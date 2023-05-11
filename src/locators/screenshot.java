package locators;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace"
				+ "\\NewWorkspace\\selenium"
				+ "\\driver\\chromedriver.exe" ) ;
		
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.nykaa.com/");
        
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\GOPI V\\eclipse-workspace\\NewWorkspace\\selenium\\screenshot\\nykaa.png");
        FileUtils.copyFile(src, dest);
        
        
        System.out.println("screenshot is taken");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
