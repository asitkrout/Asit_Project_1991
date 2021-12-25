package ui_verification_Commands.getAttribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_EditBox_Readonly_Status {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://makemytrip.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement Departcher_date=driver.findElement(By.xpath("//p[@data-cy='departureDate']"));
		String Status=Departcher_date.getAttribute("readonly");
		
		if (Status.equals("true"))
		{
			System.out.println("testpass");
		} 
		else 
		{
			System.out.println("testfail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
