package Capture_Screen;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen_With_Time_Stamp {

	public static void main(String[] args) throws IOException, Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		//Get System Default Time
		Date date=new Date();    //import java.util;
		System.out.println(date.toString());
		
		//create simple dataformat
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		
		//Cover default system date using date formatter
		String time=sdf.format(date);	
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("ScreenShots\\sample"+time+".png"));
		
		Thread.sleep(3000);
		driver.close();
		

		
		

	}

}
