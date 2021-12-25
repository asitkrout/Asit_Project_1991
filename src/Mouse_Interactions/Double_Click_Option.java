package Mouse_Interactions;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_Option {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.bridgeqsystems.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@href='demo.php'][contains(.,'Demo Site')])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='v-pills-home-tab']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(.,'Buttons')]")).click();
		Thread.sleep(3000);
		
		WebElement Doubleclick_Button=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		new Actions(driver).doubleClick(Doubleclick_Button).perform();
		
		
		String Doubleclicl_Text=driver.findElement(By.xpath("//p[@class='b1'][contains(.,'You have done a double click')]")).getText();
		System.out.println(Doubleclicl_Text); 
		
		
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();

	}

}
