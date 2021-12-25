package ui_verification_Commands.getAttribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Input_Presented_at_Editbox {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("asit");
		Thread.sleep(3000);
		
		String Typed_Email=email.getAttribute("value");
		System.out.println("typed mail id is--->>>"+Typed_Email);
		Thread.sleep(3000);
		
		email.clear();
		
		if(email.getAttribute("value").isEmpty()) 
		{
			System.out.println("no text present at edit box");
		}
		else
		{
			System.out.println("after clear text present at edit box");
		}
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
