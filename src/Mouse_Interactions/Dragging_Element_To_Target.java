package Mouse_Interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragging_Element_To_Target {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		
		WebElement Doc1=driver.findElement(By.xpath("(//img[contains(@class,'document')])[1]"));
		WebElement Doc2=driver.findElement(By.xpath("(//img[contains(@class,'document')])[2]"));
		WebElement Doc3=driver.findElement(By.xpath("(//img[contains(@class,'document')])[3]"));
		WebElement Doc4=driver.findElement(By.xpath("(//img[contains(@class,'document')])[4]"));
		
		WebElement Trush_Bin=driver.findElement(By.xpath("//div[contains(@class,'trash')]"));
		
		Actions Action=new Actions(driver);
		
		Action.dragAndDrop(Doc1, Trush_Bin).perform();
		Thread.sleep(3000);
		
		Action.dragAndDrop(Doc2, Trush_Bin).perform();
		Thread.sleep(3000);
		
		Action.clickAndHold(Doc3).moveToElement(Trush_Bin).release().perform();
		Thread.sleep(3000);
		
		Action.clickAndHold(Doc4).moveToElement(Trush_Bin).release().perform();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();
		
		
		

	}

}
