package JavaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Asynchronized_Waits {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		long start = System.currentTimeMillis();
		   ((JavascriptExecutor)driver).executeAsyncScript(
		       "window.setTimeout(arguments[arguments.length - 1], 500);");
		   System.out.println(
		       "Elapsed time: " + (System.currentTimeMillis() - start));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
