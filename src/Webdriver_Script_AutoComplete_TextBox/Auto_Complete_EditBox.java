package Webdriver_Script_AutoComplete_TextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Complete_EditBox {
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		
		WebElement From_TextBox=driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]"));
		
		From_TextBox.clear();
		
		From_TextBox.sendKeys("bhu");
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//p[contains(.,'Bhubaneswar, IN - Biju Patnaik (BBI)')]")).click();
		
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("hyd");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//p[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(.,'Search flights')]")).click();
		
		
		
		
		

	}

}
