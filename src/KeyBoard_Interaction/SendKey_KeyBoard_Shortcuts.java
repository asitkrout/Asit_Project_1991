package KeyBoard_Interaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKey_KeyBoard_Shortcuts {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		WebElement Company_Skills_Domain=driver.findElement(By.xpath("//input[@placeholder='Enter Company, Skill, Domain']"));
		Company_Skills_Domain.click();
		
		WebElement Company=driver.findElement(By.xpath("//input[@id='course']"));
		
		new Actions(driver).click(Company).sendKeys("C").pause(1000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		

	}

}
