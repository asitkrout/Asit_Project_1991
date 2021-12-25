package Mouse_Interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Hover_On_Location {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
		WebElement Time_Element=driver.findElement(By.id("menu_time_viewTimeModule"));
		new Actions(driver).moveToElement(Time_Element).perform();
		Thread.sleep(3000);
		
		WebElement Time_Reports=driver.findElement(By.id("menu_time_Reports"));
		new Actions(driver).moveToElement(Time_Reports).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.id("menu_time_displayProjectReportCriteria")).click();
	
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
