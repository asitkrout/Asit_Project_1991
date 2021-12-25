package WebDriver_Script_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_dropdown_Multiple_Selection_State {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.bridgeqsystems.com/demo.php/");
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(3000);
		
		@SuppressWarnings("unused")
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect1"))).isMultiple();
		System.out.println("dropdown multiple option selection state is -->>"+flag);
		
		
		boolean flag1=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		System.out.println("dropdown multiple option selection state is -->>"+flag1);
		
		
		
		
		
		
		
	}

}
