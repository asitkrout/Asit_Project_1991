package WebDriver_Script_List_Options;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_List_Of_Items {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();;
		
		
		
		driver.findElement(By.linkText("Select Product Type")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//li[@value='2'][contains(.,'Accounts')])[1]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Select Product")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@value='2'][contains(.,'Current Accounts')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(.,'know More')]")).click();
	
	}

}
