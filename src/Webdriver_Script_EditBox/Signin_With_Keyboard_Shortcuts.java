package Webdriver_Script_EditBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin_With_Keyboard_Shortcuts {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://outlook.live.com/owa/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@data-task='signin'])[1]")).click();
		
		driver.findElement(By.name("loginfmt")).sendKeys("asitkumar1169@outlook.com"+Keys.ENTER);
		
		Thread.sleep(5000);
		
		
	}

}
