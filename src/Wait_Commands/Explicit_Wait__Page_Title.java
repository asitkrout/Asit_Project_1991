package Wait_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait__Page_Title {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		try 
		{
			wait.until(ExpectedConditions.titleIs("Selenium"));
			System.out.println("title verified");
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		
		WebElement Download_Tab=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
		Download_Tab.click();
		
		try {
			wait.until(ExpectedConditions.titleContains("downloads"));
			System.out.println("download page varified");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
