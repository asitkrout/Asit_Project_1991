package ui_verification_Commands.getAttribute;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Attribute_Value1 {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> Verify Roundtrip radio button selection
		 * 		Given site url is "http://makemytrip.com"
		 * 		And verify triptype selecton oneway on browser launch
		 * 		When user tap on return date for bigger discounts
		 * 		Then Selection comes to roundtrip from oneway
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		
		
		
		WebElement Trip_type_Oneway=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		String Oneway_Class=Trip_type_Oneway.getAttribute("Class");
		System.out.println(Oneway_Class);
		
		if (Oneway_Class.equals("selected"))
		{
			System.out.println("As expected oneway is selected on browser lunch");
			WebElement Return_Data=driver.findElement(By.xpath("//label[contains(.,'RETURNTap to add a return date for bigger discounts')]"));
			Return_Data.click();
			Thread.sleep(4000);
			
			WebElement Trip_Type_Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
			String Roundtrip_Class=Trip_Type_Roundtrip.getAttribute("class");
			
				if (Roundtrip_Class.equals("selected"))
				{
					System.out.println("Testpass, roundtrip selected");
				}
				
				else
				{
					System.out.println("Testfail, round trip not selected");
				}
					
			
		} 
		
		else
		{
			System.out.println("oneway is not selected on browser lunch");
		}
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
