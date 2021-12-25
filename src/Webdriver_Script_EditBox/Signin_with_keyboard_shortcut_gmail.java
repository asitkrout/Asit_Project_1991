package Webdriver_Script_EditBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Signin_with_keyboard_shortcut_gmail {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("identifier")).sendKeys("asitkumarrout.papu"+Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("7978312970"+Keys.ENTER);
		
		Thread.sleep(15000);
		
		//driver.close();
		
		

	}

}
