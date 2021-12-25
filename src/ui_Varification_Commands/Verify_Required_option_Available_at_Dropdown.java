package ui_Varification_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Required_option_Available_at_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		Select Product_Type_Dropdown=new Select(driver.findElement(By.xpath("//span[contains(.,'Select Product Type')]")));
		Product_Type_Dropdown.selectByVisibleText("Cards");
		Thread.sleep(5000);
		
		WebElement Product_Dropdown=driver.findElement(By.xpath("//a[contains(.,'Select Product')]"));
		String Products=Product_Dropdown.getText();
		System.out.println(Products);
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
