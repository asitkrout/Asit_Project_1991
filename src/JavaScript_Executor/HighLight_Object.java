package JavaScript_Executor;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HighLight_Object {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		WebElement Dropable=driver.findElement(By.xpath("//a[@href='http://jqueryui.com/droppable/']"));
		JavascriptExecutor Js=((JavascriptExecutor)driver);
		Js.executeScript("arguments[0].style.outline='thick solid red'", Dropable);
		Js.executeScript("arguments[0].style.backgroundColor='blue'", Dropable);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("ScreenShots"));
		FileHandler.copy(src, new File("ScreenShots\\Jqueryi_Dropable"));
		
		
		
		
		
		
		
	}

}
