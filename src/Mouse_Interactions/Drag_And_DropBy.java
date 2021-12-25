package Mouse_Interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		
		WebElement Slider=driver.findElement(By.xpath("(//div[contains(@class,'rangeslider__handle')])[1]"));
		
		new Actions(driver).dragAndDropBy(Slider, 135, 0).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
