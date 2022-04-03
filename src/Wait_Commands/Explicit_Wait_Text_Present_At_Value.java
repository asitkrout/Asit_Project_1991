package Wait_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Text_Present_At_Value {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
		
		WebElement Email=driver.findElement(By.xpath("//input[@type='tel']"));
		Email.clear();
		Email.sendKeys("7978312970");
		
		By Text_Location=By.xpath("//input[@autocomplete='off']");
		WebDriverWait Wait=new WebDriverWait(driver, 50);
		
		try {
			Wait.until(ExpectedConditions.textToBePresentInElementValue(Text_Location, "Jio"));
			System.out.println("text present at desired location");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
