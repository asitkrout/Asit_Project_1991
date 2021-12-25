package Switch_Commands_Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Navigation_Commands {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://jqueryui.com/resources/demos/dialog/default.html");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']")).click();
		System.out.println("Dolog Box Closed");
		
		
		driver.navigate().back();
		
		
		

	}

}
