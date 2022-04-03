package Chrome_Options;

import java.io.File;
import java.sql.Array;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adding_Plugins_To_Automation_Browser {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addExtensions(new File("C:\\Users\\user\\Downloads\\chropath.crx"));
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://jqueryui.com/");
		//driver.manage().window().maximize();
		
		System.out.println("browser is up and ready to use");
		System.out.println("title"+driver.getTitle());
		
		
		
		
		
		
	}

}
