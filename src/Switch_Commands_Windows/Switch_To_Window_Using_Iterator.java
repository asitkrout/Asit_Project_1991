package Switch_Commands_Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Window_Using_Iterator {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String MainWindowID=driver.getWindowHandle();
		
		WebElement Insta_Link=driver.findElement(By.linkText("Instagram"));
		Insta_Link.click();
		Thread.sleep(5000);
		
		System.out.println("current Focused window Before switch is -->>"+driver.getTitle());
		
		Set<String> AllWindowIDs=driver.getWindowHandles();
		System.out.println("number of windows is -->>"+AllWindowIDs.size());
		
		Iterator<String> Itr=AllWindowIDs.iterator();
		String W1=Itr.next();
		String W2=Itr.next();
		
		driver.switchTo().window(W2);
		System.out.println("current Focused window after switch is -->>"+driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
