package miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createaccountingoogle {
	
	public static void main(String[] args) throws AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace\\NewWorkspace\\selenium\\driver\\chromedriver.exe");	
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
			driver.manage().window().maximize();

			Robot r = new Robot();
			
			WebElement Firstname = driver.findElement(By.xpath("/html/body/div/div/div[2]/div"
					+ "/div[2]/div/div/div[2]/div/div/div/form/span"
					+ "/section/div/div/div/div/div/div/div/div/div/input"));
			Firstname.sendKeys("dhanush");
			
			WebElement Lastname = driver.findElement(By.xpath("/html/body/div/div/div[2]/div"
					+ "/div[2]/div/div/div[2]/div/div/div/form/span/section/div/div/"
					+ "div/div/div[2]/div/div/div/div/input"));
			Lastname.sendKeys("developer");
			
			WebElement Username = driver.findElement(By.xpath("/html/body/div/div/div[2]/div"
					+ "/div[2]/div/div/div[2]/div/div/div/form/span"
					+ "/section/div/div/div[2]/div/div/div/div/div/input"));
			Username.sendKeys("dhanushdevops03");
			
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]"
					+ "/div/div/div[2]/div/div/div/form/span/section/div/"
					+ "div/div[3]/div/div/div/div/div/div/div/div/input")).click();
			
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_D);
			r.keyRelease(KeyEvent.VK_D);
			r.keyRelease(KeyEvent.VK_SHIFT);
			
			
			r.keyPress(KeyEvent.VK_H);
			r.keyRelease(KeyEvent.VK_H);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_N);
			r.keyRelease(KeyEvent.VK_N);
			r.keyPress(KeyEvent.VK_U);
			r.keyRelease(KeyEvent.VK_U);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_S);
			r.keyPress(KeyEvent.VK_H);
			r.keyRelease(KeyEvent.VK_H);
			
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_2);
			r.keyRelease(KeyEvent.VK_2);
			r.keyRelease(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_3);
			r.keyRelease(KeyEvent.VK_3);
			r.keyPress(KeyEvent.VK_7);
			r.keyRelease(KeyEvent.VK_7);
			
			WebElement Confirmpass = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]"
					+ "/div/div/div[2]/div/div/div/form/span/section"
					+ "/div/div/div[3]/div/div/div/div[2]/div/div/div/div/input"));
			Confirmpass.click();
			
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_D);
			r.keyRelease(KeyEvent.VK_D);
			r.keyRelease(KeyEvent.VK_SHIFT);
			
			
			r.keyPress(KeyEvent.VK_H);
			r.keyRelease(KeyEvent.VK_H);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_N);
			r.keyRelease(KeyEvent.VK_N);
			r.keyPress(KeyEvent.VK_U);
			r.keyRelease(KeyEvent.VK_U);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_S);
			r.keyPress(KeyEvent.VK_H);
			r.keyRelease(KeyEvent.VK_H);
			
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_2);
			r.keyRelease(KeyEvent.VK_2);
			r.keyRelease(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_3);
			r.keyRelease(KeyEvent.VK_3);
			r.keyPress(KeyEvent.VK_7);
			r.keyRelease(KeyEvent.VK_7);
			
			WebElement Tickbox  = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div"
					+ "/div/div[2]/div/div/div/form/span/section/div"
					+ "/div/div[3]/div[3]/div/div/div/div/div/div/input"));
			Tickbox.click();
			 TakesScreenshot ts = (TakesScreenshot) driver;
		        File src = ts.getScreenshotAs(OutputType.FILE);
		        File dest = new File("C:\\Users\\GOPI V\\eclipse-workspace\\NewWorkspace"
		        		+ "\\selenium\\screenshot\\Google.png");
		        FileUtils.copyFile(src, dest);
		        
		        WebElement Next = driver.findElement(By.xpath("/html/body/div/div/div[2]/div"
		        		+ "/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button/span"));
		        Next.click();
		        
		        System.out.println("Hence the google account for dhanush is created");
		        
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			
			
			
			
		
		      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
