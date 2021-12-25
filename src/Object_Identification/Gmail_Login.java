package Object_Identification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/gmail/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("asitkumar1169"+Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("freedom@"+Keys.ENTER);
		
		
	}

}
