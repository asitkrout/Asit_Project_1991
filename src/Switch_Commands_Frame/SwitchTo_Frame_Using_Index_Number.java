package Switch_Commands_Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Index_Number {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(.,'Dialog')]")).click();
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']")).click();
		System.out.println("Dolog Box Closed");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(.,'Demos')]")).click();
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
