package Capture_Screen;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_Using_Robot_Class {

	public static void main(String[] args) throws AWTException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		BufferedImage image=robot.createScreenCapture(new Rectangle(1200, 800));
		ImageIO.write(image, "PNG", new File("C:\\Users\\user\\Downloads\\Testing Sw\\Selenium_workspace\\project_1991\\ScreenShots\\img1.png"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
