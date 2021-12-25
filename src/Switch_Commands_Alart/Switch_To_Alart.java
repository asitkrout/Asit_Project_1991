package Switch_Commands_Alart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Alart {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.bridgeqsystems.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(.,'Demo Site')]")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'Alerts, Frames & Windows')]")).click();
		
		driver.findElement(By.xpath("//button[contains(.,'Alerts')]")).click();
		
		driver.findElement(By.xpath("//button[contains(@id,'alertButton')]")).click();
		Thread.sleep(5000);
		
		String Alart_text=driver.switchTo().alert().getText();
		System.out.println(Alart_text);
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.close();
		
			
		
		
	}

}
