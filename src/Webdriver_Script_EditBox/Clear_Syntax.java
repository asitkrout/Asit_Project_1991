package Webdriver_Script_EditBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Syntax {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Asit");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("firstname")).clear();
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("firstname")).sendKeys("rout");
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		

	}

}
