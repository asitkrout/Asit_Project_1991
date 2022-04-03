package Wait_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Visibility {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//hide object using java script
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('email').setAttribute('style','display:none')");
		
		WebDriverWait Wait=new WebDriverWait(driver, 50);
		
		try {
			WebElement Username=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
			Username.clear();
			Username.sendKeys("asit");
			System.out.println("object is visible and email is typed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		driver.close();
		

	}

}
