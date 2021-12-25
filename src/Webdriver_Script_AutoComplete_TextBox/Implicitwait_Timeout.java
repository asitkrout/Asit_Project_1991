package Webdriver_Script_AutoComplete_TextBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait_Timeout {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		
		WebElement From_TextBox=driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]"));
		
		From_TextBox.clear();
		
		From_TextBox.sendKeys("bhu");
	
		driver.findElement(By.xpath("//p[contains(.,'Bhubaneswar, IN - Biju Patnaik (BBI)')]")).click();
		
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).clear();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
