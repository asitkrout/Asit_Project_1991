package Practice_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Railway_PNR_Status_Check {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.indianrail.gov.in/enquiry/PNR/PnrEnquiry.html?locale=en");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='inputPnrNo']")).sendKeys("6456126770");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='modal1']")).click();
		
		String Alart_Text=driver.switchTo().alert().getText();
		System.out.println(Alart_Text);
		
		
		
		

	}

}
