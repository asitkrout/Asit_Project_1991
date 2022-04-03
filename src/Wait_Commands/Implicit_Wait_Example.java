package Wait_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Example {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email"));
		System.out.println("email identified at facebook page");
		
		driver.findElement(By.xpath("(//span[contains(.,'Outlook')])[2]"));
		System.out.println("email identified at outlook page");
		
		
		
		
		
		
		
	}

}
