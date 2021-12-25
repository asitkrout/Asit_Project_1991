package Capture_Screen;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen_At_Requited_Location {

	public static void main(String[] args) throws IOException, Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		new Actions(driver).sendKeys(Keys.END).perform();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("screenshots\\facebook_footerlinks.png"));
		Thread.sleep(3000);
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		

	}

}
