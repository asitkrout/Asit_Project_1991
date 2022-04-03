package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_With_Xpath {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor Js=((JavascriptExecutor)driver);
		
		Js.executeScript("document.getElementById(\'email').value = \'Johnny Bravo\'");
		Thread.sleep(2000);
		Js.executeScript("document.getElementById('pass').value='Hello123'");
		Thread.sleep(2000);
		
		WebElement Login_Btn=driver.findElement(By.xpath("//button[@name='login']"));
		Js.executeScript("arguments[0].click()", Login_Btn);
		
		
		
		
		
		
		
		
		
		
		
	}

}
