package Wait_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Frame {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("modal_window"));
			System.out.println("now controls available in frame");
			WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
			Email.sendKeys("asitkumar1169@gmail.com");
			
			driver.switchTo().defaultContent();
			System.out.println("now controls at main page");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
