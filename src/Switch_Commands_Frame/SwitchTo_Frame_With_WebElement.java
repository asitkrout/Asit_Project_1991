package Switch_Commands_Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_With_WebElement {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(.,'Dialog')]")).click();
		
		WebElement Frame_Location=driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']"));

		driver.switchTo().frame(Frame_Location);
		
		

	}

}
