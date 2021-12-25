package Switch_Commands_Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Webdriver_Script.webdriver_interface;

public class SwitchTo_Child_Frame {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(.,'Iframe with in an Iframe')]")).click();
		Thread.sleep(5000);
		
		WebElement Parent_Frame=driver.findElement(By.xpath("//"));
		
		driver.switchTo().frame(Parent_Frame);
		
		Thread.sleep(3000);
		
		
		
		
		WebElement Child_Frame=driver.findElement(By.xpath("//iframe[contains(.,'<p>Your browser does not support iframes.</p>')]"));
		
		driver.switchTo().frame(Child_Frame);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hellow friends");
		
		

	}

}
