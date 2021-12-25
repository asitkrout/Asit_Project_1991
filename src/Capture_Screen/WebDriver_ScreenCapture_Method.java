package Capture_Screen;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebDriver_ScreenCapture_Method {

	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		//Capture Screen and Convert into File output
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("ScreenShots"));
		FileHandler.copy(src, new File("ScreenShots\\sample.png"));   //.PNG - Potable Network grafic
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
