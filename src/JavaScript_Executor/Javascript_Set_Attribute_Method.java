package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Set_Attribute_Method {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor Js=((JavascriptExecutor)driver);
		
		WebElement Login_Btn=driver.findElement(By.name("login"));
		Js.executeScript("arguments[0].setAttribute('disabled','disabled')", Login_Btn);
		Thread.sleep(10000);
		
		Js.executeScript("arguments[0].removeAttribute('disabled','disabled')", Login_Btn);
		System.out.println("editbox is enabled");
		
		
		
		
		
		
	}

}
