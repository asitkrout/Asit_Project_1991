package Wait_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_Element_Selection_State_With_True_Or_False_Condition {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		WebElement Female_Radio_Btn=driver.findElement(By.xpath("//input[@value='1']"));
		Female_Radio_Btn.click();
		
		WebDriverWait Wait=new WebDriverWait(driver, 50);
		
		try {
			Wait.until(ExpectedConditions.elementSelectionStateToBe(Female_Radio_Btn, false));
			System.out.println("radio btn is selected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
