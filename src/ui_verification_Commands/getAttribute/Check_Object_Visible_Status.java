package ui_verification_Commands.getAttribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Object_Visible_Status {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("info@email.com");
		Thread.sleep(3000);
		
		WebElement retype_division=driver.findElement(By.name("reg_email_confirmation__"));
		String runtime_Class=retype_division.getAttribute("class");
		
		if (runtime_Class.equals("inputtext _58mg _5dba _2ph-")) 
		{
			System.out.println("testpass");
		} 
		else 
		{
			System.out.println("Testfail");
		}
		
		if (retype_division.isDisplayed()) 
		{
			System.out.println("object visible at webpage");
		}
		else 
		{
			System.out.println("object is not visible at webpage");
		}
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
