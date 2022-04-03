package Switch_Commands_Windows;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Required_Window_Where_Multiple_Window_Are_Open {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		String Main_WindowID=driver.getWindowHandle();
		
		WebElement Train_Pnr=driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/pnr']"));
		Train_Pnr.click();
		Thread.sleep(3000);
		
		WebElement Train_Calender=driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/calendar']"));
		Train_Calender.click();
		Thread.sleep(3000);
		
		WebElement Train_Cancel=driver.findElement(By.xpath("//a[contains(@href,'cancellation.shtml#cancel')]"));
		Train_Cancel.click();
		Thread.sleep(3000);
		
		Set<String> AllWindowIDs=driver.getWindowHandles();
		for (String EachWindowIDs : AllWindowIDs) 
		{
			driver.switchTo().window(EachWindowIDs);
			
			String Run_time_Page_Title=driver.getTitle();
			System.out.println(Run_time_Page_Title);
			
			if (Run_time_Page_Title.contains("Railway Seat Availability"))
			{
				break;
			}
		}
		
		
		//driver.switchTo().window(Main_WindowID);
		//System.out.println("Current page title"+driver.getTitle());
		
		
		
		
		
		
		
		
		
		
	}

}
