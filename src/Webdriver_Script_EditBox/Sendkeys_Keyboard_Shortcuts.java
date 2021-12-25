package Webdriver_Script_EditBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Keyboard_Shortcuts {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Asit"+Keys.TAB);
		
		driver.findElement(By.name("lastname")).sendKeys("Rout"+Keys.TAB);
		
		driver.findElement(By.name("reg_email__")).sendKeys("asitkumar1169@gmail.com"+Keys.TAB);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("7978312970"+Keys.TAB);
		
		driver.findElement(By.name("birthday_day")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.TAB);
		
		driver.findElement(By.name("birthday_month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB);
		
		driver.findElement(By.name("birthday_year")).sendKeys("1991");
		
		driver.findElement(By.xpath("//label[@class='_58mt'][contains(.,'Male')]")).click();
		
		
		
		
		

	}

}
