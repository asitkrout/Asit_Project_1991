package Chrome_Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Incognito_Mode {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("incognito");
		options.addArguments("start-maximized");
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://jqueryui.com/");
		//driver.manage().window().maximize();
		
		System.out.println("browser is up and ready to use");
		System.out.println("title"+driver.getTitle());
		
		
		
		
		
		
	}

}
