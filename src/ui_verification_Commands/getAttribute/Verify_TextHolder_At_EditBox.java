package ui_verification_Commands.getAttribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_TextHolder_At_EditBox {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String Username_PlaceholderText=driver.findElement(By.id("pass")).getAttribute("placeholder");
		
		if (Username_PlaceholderText.equals("Password")) 
		{
			System.out.println("testpass, placeholder text is available");
		} 
		else 
		{
			System.out.println("testfail, placeholder text is not available");
		}
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
