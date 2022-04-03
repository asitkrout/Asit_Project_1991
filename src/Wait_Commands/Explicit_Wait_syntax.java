package Wait_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_syntax {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		WebDriverWait Wait=new WebDriverWait(driver, 50);
		
		try {
			Wait.until(ExpectedConditions.titleContains("Selenium"));
			System.out.println("Selenium title verified");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String Runtime_Title=driver.getTitle();
		boolean Flag=Runtime_Title.equals("Selenium");
		
		if (Flag==true) 
		{
			System.out.println("title verified");
		} 
		else
		{
			System.out.println("title not verified");
		}
		
		
		
		
		
		
		
		
		driver.close();
	}

}
