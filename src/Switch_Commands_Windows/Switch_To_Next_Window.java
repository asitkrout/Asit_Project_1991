package Switch_Commands_Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Next_Window {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String MainWindowID=driver.getWindowHandle();
		
		WebElement Insta_Link=driver.findElement(By.linkText("Instagram"));
		Insta_Link.click();
		
		Set<String> AllWindowIDs=driver.getWindowHandles();
		for (String EachWindowIDs : AllWindowIDs) 
		{
			driver.switchTo().window(EachWindowIDs);
		}
		Thread.sleep(3000);
		System.out.println("current window page title-->"+driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("asit");
		Thread.sleep(3000);
		
		driver.switchTo().window(MainWindowID);
		System.out.println("current window page"+driver.getTitle());
		
		Thread.sleep(3000);
		System.out.println("current window page title-->"+driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asit");
		
		
		
		
	}

}
