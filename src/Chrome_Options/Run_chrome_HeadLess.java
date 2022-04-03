package Chrome_Options;

import javax.swing.text.html.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.jar.asm.Opcodes;

public class Run_chrome_HeadLess {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--headless");
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://jqueryui.com/");
		//driver.manage().window().maximize();
		
		System.out.println("browser is up and ready to use");
		System.out.println("title"+driver.getTitle());
		
		
		
		
		
		
		
		
		
		
	}

}
