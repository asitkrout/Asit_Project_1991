package WebDriver_Script_DatePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Data_From_DatePicker {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Leave")).click();
		
		driver.findElement(By.id("calFromDate")).click();
		
		new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"))).selectByVisibleText("Dec");
		
		driver.findElement(By.linkText("22")).click();
		
		driver.findElement(By.id("calToDate")).click();
		
		new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"))).selectByVisibleText("Dec");
		
		driver.findElement(By.linkText("27")).click();
		
		driver.findElement(By.name("leaveList[txtEmployee][empName]")).sendKeys("raj");
		
		driver.findElement(By.xpath("//li[contains(.,'Raja B')]")).click();
		
		new Select(driver.findElement(By.name("leaveList[cmbSubunit]"))).selectByVisibleText("Engineering");
		
		driver.findElement(By.name("leaveList[cmbWithTerminated]")).click();
		
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		
	}

}
