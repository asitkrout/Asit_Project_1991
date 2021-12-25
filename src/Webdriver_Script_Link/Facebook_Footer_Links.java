package Webdriver_Script_Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Footer_Links {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("English (UK)")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Log In")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Lite")).click();
		Thread.sleep(5000);
		
		driver.close();
		
		
		

	}

}
