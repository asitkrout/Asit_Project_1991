package Mouse_Interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_click_Option {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement Context_Click=driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
		new Actions(driver).contextClick(Context_Click).perform();
		
		driver.findElement(By.xpath("(//span[contains(.,'Edit')])[2]")).click();
		Thread.sleep(3000);
		
		String Alart_Text=driver.switchTo().alert().getText();
		System.out.println(Alart_Text);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		Thread.sleep(10000);
		driver.close();

	}

}
