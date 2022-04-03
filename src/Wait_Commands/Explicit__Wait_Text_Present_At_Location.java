package Wait_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit__Wait_Text_Present_At_Location {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@data-m='{\"cN\":\"SIGNIN\",\"sN\":\"P6\",\"pV\":\"1\"}']")).click();
		
		WebElement Email=driver.findElement(By.id("i0116"));
		Email.clear();
		Email.sendKeys("asitkumar1169@gmail.com"+Keys.ENTER);
		
		By Text_Location=By.xpath("//div[@id='displayName']");
		WebDriverWait Wait=new WebDriverWait(driver, 50);
		
		try {
			Wait.until(ExpectedConditions.textToBePresentInElementLocated((By) Text_Location, "asitkumar1169@gmail.com"));
			System.out.println("text present at desired location");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
