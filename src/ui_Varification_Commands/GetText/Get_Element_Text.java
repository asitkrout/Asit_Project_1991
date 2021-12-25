package ui_Varification_Commands.GetText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Text 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://outlook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement Signin_Button=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_Button.click();
		
		Thread.sleep(3000);
		WebElement Email_TextBox=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email_TextBox.clear();
		
		Thread.sleep(3000);
		Email_TextBox.sendKeys("safnbdhto");
		Email_TextBox.submit();
		
		WebElement Error_Location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String Error_Msg=Error_Location.getText();
		System.out.println(Error_Msg);
		
		String Exp_Error_Msg="Please enter the password for your Microsoft account.";
		
		if (Error_Msg.equals(Exp_Error_Msg))
		{
			System.out.println("Test pass, as expexted error msg displayed");
		} 
		else 
		{
			System.out.println("Test fail,expected error msg not displayed");
		}
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		

	}

}
