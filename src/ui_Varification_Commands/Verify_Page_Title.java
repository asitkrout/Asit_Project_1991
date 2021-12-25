package ui_Varification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import mq.java.Decision_Statements.IF_Else_StateMent;

public class Verify_Page_Title 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		String page_Title=driver.getTitle();
		System.out.println("Current page title--->"+page_Title);
		
		String Exp_Title="Selenium";
		Boolean flag=page_Title.equals(Exp_Title);
		System.out.println("Title Equals Compairasion is ---->>"+flag);
		
		if (flag==true)
		{
			System.out.println("Testpass as expected title is present");
			WebElement download=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
			download.click();
			
			if (driver.getTitle().equals("Downloads | Selenium"))
			{
				System.out.println("Testpass, download page is verified");
			}
			else
			{
				System.out.println("Test fail, download page nit verified");
			}
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		

	}

}
