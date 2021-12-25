package ui_Varification_Commands.GetText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Page_Text {

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
		Email_TextBox.sendKeys("ddnvhoh"+Keys.ENTER);
		Thread.sleep(4000);
		
		String Page_Text=driver.findElement(By.tagName("body")).getText();
		System.out.println(Page_Text);
		
		String Exp_eror_msg="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		
		if (Page_Text.contains(Exp_eror_msg))
		{
			System.out.println("testpass, error msg displayed");
		}
		else
		{
			System.out.println("testfail, error msg not displayed");

		}
			
			
			
			
		Thread.sleep(3000);
		driver.close();
		
	}

}
