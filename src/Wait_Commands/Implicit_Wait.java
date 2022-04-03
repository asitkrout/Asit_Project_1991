package Wait_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Long start_time=System.currentTimeMillis();
		
		try 
		{
			driver.findElement(By.id("email123"));
			System.out.println("object Identified");	
		}
		catch (Exception e) 
		{
			System.out.println(System.currentTimeMillis()-start_time);
		}
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
