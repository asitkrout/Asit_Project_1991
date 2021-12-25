package ui_Varification_Commands;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_At_Page_Source {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		if (driver.getPageSource().contains("email"))
		{
			driver.findElement(By.id("email")).sendKeys("asit");
			System.out.println("Element is present at page source");
		}
		else
		{
			System.out.println("element not found in page source");
		}
		
		try {
			
			driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Hello1234");
			System.out.println("Pssword element present at page source");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println("Run Continues");
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
