package ui_Varification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_expected_records_Available_In_Tables {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().window().maximize();
		
		
		//Identify Table
		String All_Table_Records=driver.findElement(By.id("tblMarketToday")).getText();
		if(All_Table_Records.contains("Sun Pharma.Inds."))
		{
			System.out.println("Testpass, Record exist at webpage");
		}
		else
		{
			System.out.println("Testfail, Record doesn't exist at webapge");
		}

		
		Thread.sleep(3000);
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
