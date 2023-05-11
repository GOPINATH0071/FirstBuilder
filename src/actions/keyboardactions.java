package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardactions {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace"
				+ "\\NewWorkspace\\selenium\\driver\\chromedriver.exe");	
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/campaign/landing.php?campaign"
					+ "_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin"
					+ "%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9061968%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiA6fafBhC1A"
					+ "RIsAIJjL8kr8BF7kAlUgAHr01DPI7RQXQl3RM"
					+ "fM5cDKGwjIsFMdZkMb6yjCkIAaAvZYEALw_wcB");
			driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).click();
		
		Robot r = new Robot();
	     
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);
		
		
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_0);
		
		r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_P);
		
        
        r.keyPress(KeyEvent.VK_I);
        r.keyRelease(KeyEvent.VK_I);
        
      driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).click();
      
      r.keyPress(KeyEvent.VK_N);
	  r.keyRelease(KeyEvent.VK_N);
    
	  r.keyPress(KeyEvent.VK_A);
	  r.keyRelease(KeyEvent.VK_A);
	  
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_T);
		
	  r.keyPress(KeyEvent.VK_H);
	  r.keyRelease(KeyEvent.VK_H);
		
		
		driver.findElement(By.xpath("(//input[@type=\"text\"]) [3]")).click();
		
		r.keyPress(KeyEvent.VK_G);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_2);
		 r.keyRelease(KeyEvent.VK_SHIFT);
		
		
		
		 r.keyPress(KeyEvent.VK_G);
		 r.keyPress(KeyEvent.VK_M);
		 r.keyPress(KeyEvent.VK_A);
		 r.keyPress(KeyEvent.VK_I);
		 r.keyPress(KeyEvent.VK_L);
		
		
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).click();
		
		 r.keyPress(KeyEvent.VK_7);
		 r.keyPress(KeyEvent.VK_7);
		 r.keyPress(KeyEvent.VK_8); 
		 r.keyPress(KeyEvent.VK_4);
		 r.keyPress(KeyEvent.VK_SHIFT);
		 r.keyPress(KeyEvent.VK_2);
		 r.keyRelease(KeyEvent.VK_SHIFT);
		 r.keyPress(KeyEvent.VK_G);
		 r.keyPress(KeyEvent.VK_R);
		 
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
