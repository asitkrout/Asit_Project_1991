package Wait_Commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Alart {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		WebElement Nav_Alart=driver.findElement(By.xpath("//a[@aria-controls='v-pills-messages']"));
		Nav_Alart.click();
		Thread.sleep(3000);
		
		WebElement Alart_Link=driver.findElement(By.xpath("//button[contains(.,'Alerts')]"));
		Alart_Link.click();
		Thread.sleep(3000);
		
		WebElement Alart_Btn=driver.findElement(By.xpath("//button[contains(@id,'timerAlertButton')]"));
		Alart_Btn.click();
		Thread.sleep(3000);
		
		WebDriverWait Wait=new WebDriverWait(driver, 50);
		
		try {
			Alert alert=Wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("alert msg"+alert.getText());
			Thread.sleep(3000);
			
			alert.accept();
			System.out.println("Alert Accepted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
