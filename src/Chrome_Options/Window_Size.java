package Chrome_Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window_Size {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-window-size=400,400");
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://jqueryui.com/");
		
		System.out.println("browser is up and ready to use");
		System.out.println("title"+driver.getTitle());
		
		
		
		
		
		
		
	}

}
