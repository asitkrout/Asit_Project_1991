package WebDriver_Script_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Select_Commands {

	public static void main(String[] args) throws Exception 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.linkText("Recruitment")).click();
		
		new Select(driver.findElement(By.id("candidateSearch_jobTitle"))).selectByVisibleText("Account Assistant");
		Thread.sleep(2000);
		
		new Select(driver.findElement(By.id("candidateSearch_jobVacancy"))).selectByValue("5");
		Thread.sleep(2000);
		
		new Select(driver.findElement(By.id("candidateSearch_hiringManager"))).selectByIndex(1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"candidateSearch_status\"]/option[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("candidateSearch_modeOfApplication")).sendKeys("Manual");
		Thread.sleep(2000);
		
		System.out.println("asit is selected");
		
		
		
		
		 driver.close();
		
		
		
		
		
		
		
		
		
	}

}
