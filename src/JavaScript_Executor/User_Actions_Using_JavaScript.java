package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class User_Actions_Using_JavaScript {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("email")).sendKeys("asitkumar1169");
		
		JavascriptExecutor Js=((JavascriptExecutor)driver);
		Js.executeScript("document.getElementById(\'email').value = \'Johnny Bravo\'");
		Thread.sleep(2000);
		Js.executeScript("document.getElementById('pass').value='Hello123'");
		Thread.sleep(2000);
		
		
		
	}

}
