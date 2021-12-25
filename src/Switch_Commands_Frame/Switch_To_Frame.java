package Switch_Commands_Frame;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Frame {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/account/trips");
		
		driver.manage().window().maximize();
		
		//controls switched to frame
		driver.switchTo().frame("modal_window");
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("asit"+Keys.TAB);
		
		driver.findElement(By.id("tripidSecond")).sendKeys("455256"+Keys.TAB+Keys.ENTER);
		
		//control back to mainpage from frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@href='javascript:void(0);'][contains(.,'Feedback')]")).click();
		Thread.sleep(5000);
		
		driver.switchTo().frame("modal_window");
		
		driver.findElement(By.xpath("//button[contains(.,'Back to home')]")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
