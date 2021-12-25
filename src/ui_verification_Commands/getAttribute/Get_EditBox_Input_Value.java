package ui_verification_Commands.getAttribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_EditBox_Input_Value {

	public static void main(String[] args) throws Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement mobile_no=driver.findElement(By.xpath("//input[@type='tel']"));
		mobile_no.sendKeys("7978312970");
		Thread.sleep(3000);
		
		WebElement Operator_Editbox=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		String Operator_Nmae=Operator_Editbox.getAttribute("value");
		System.out.println(Operator_Nmae);
		
		if (Operator_Nmae.equals("Jio"))
		{
			System.out.println("operator selected corectly");
		} 
		else 
		{
			System.out.println("operator selected wrongly");
		}
		
		WebElement Circle_Editbox=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		String Circle_name=Circle_Editbox.getAttribute("value");
		System.out.println(Circle_name);
		
		if (Circle_name.equals("Orissa")) 
		{
			System.out.println("circle selected correctly");
		} 
		else 
		{
			System.out.println("circle selected wrongly");
		}
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
