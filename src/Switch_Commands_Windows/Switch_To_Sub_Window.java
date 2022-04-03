package Switch_Commands_Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Sub_Window {

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
		
		Set<String> AllWindowIDs=driver.getWindowHandles();
		System.out.println("Number of Windows available"+AllWindowIDs.size());
		
		for (String EachWindowIDs : AllWindowIDs) 
		{
			driver.switchTo().window(EachWindowIDs);
		}
		
		WebElement PNR_Editbox=driver.findElement(By.xpath("//input[@id='pnr']"));
		PNR_Editbox.click();
		PNR_Editbox.sendKeys("12345678");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
