package Wait_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_For_Url {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		//WebDriverWait wait=new WebDriverWait(driver, 50);
		
		try {
			new WebDriverWait(driver, 50).until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
			System.out.println("Selenium Url is loded");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		WebElement Download_Tab=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
		Download_Tab.click();
		
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.urlContains("downloads"));
			System.out.println("download page verified");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	
		driver.close();
	}

}
