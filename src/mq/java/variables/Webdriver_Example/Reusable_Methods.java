package mq.java.variables.Webdriver_Example;

import java.io.File;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Reusable_Methods 
{
	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/";
	

	public void lunch_Browser() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
	}
	public void loadpage() throws Exception
	{
		
	}
	
	public void user_Login() throws Exception
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
	public void capturescreen(String imagename) throws Exception
	{
		try {
			//Get System Default Time
			Date date=new Date();    //import java.util;
			System.out.println(date.toString());
					
			//create simple dataformat
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
					
			//Cover default system date using date formatter
			String time=sdf.format(date);	
					
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("Screens\\"+imagename+time+".png"));
		} catch (Exception e) {
			e.printStackTrace();
			
			Thread.sleep(5000);
			driver.close();
		}
		
		
		
		
	}
}
