package ui_Varification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_URL {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		if (driver.getCurrentUrl().equals("https://www.selenium.dev/"))
		{
			System.out.println("Testpass, expected URL present");
			
			Thread.sleep(3000);
			WebElement downloads=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
			downloads.click();
			
			if (driver.getCurrentUrl().contains("downloads/")) 
				System.out.println("testpass, download page url verified");
			else
				System.out.println("testfail, download page not verified");
			
		
		}
		else
		{
			System.out.println("Test fail, expected URL not found");
		}
		
		
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
