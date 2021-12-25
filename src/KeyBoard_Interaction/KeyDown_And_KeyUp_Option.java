package KeyBoard_Interaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_And_KeyUp_Option {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		WebElement Frame_Element=driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]"));
		driver.switchTo().frame(Frame_Element);
		
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		Thread.sleep(4000);
		
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(Keys.chord("r")).perform();
		Thread.sleep(3000);
		
		new Actions(driver).keyUp(Keys.CONTROL).perform();
		Thread.sleep(4000);
		
		
		driver.close();
	}

}
