package Switch_Commands_Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Between_Frames {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.epass.apcfss.in/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("menuFrame");
		
		System.out.println("Now your controls are under frame");
		
		driver.findElement(By.xpath("//a[@href='FeestructureReport.do']")).click();
		
		
		
		
		
		
		
		
		

	}

}
