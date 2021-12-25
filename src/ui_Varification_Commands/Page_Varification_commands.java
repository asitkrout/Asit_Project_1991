package ui_Varification_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Varification_commands
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		String page_Title=driver.getTitle();
		System.out.println("Current page title--->"+page_Title);
		
		String page_URL=driver.getCurrentUrl();
		System.out.println("Current page URL---->>"+page_URL);
		
		String windows_Id=driver.getWindowHandle();
		System.out.println("Current windows id --->>"+windows_Id);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
	}

}
