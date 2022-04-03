package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Scroll_To_View {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor Js=((JavascriptExecutor)driver);
		
		WebElement Signin_Link=driver.findElement(By.linkText("Sign Up"));
		Js.executeScript("arguments[0].scrollIntoView()", Signin_Link);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
