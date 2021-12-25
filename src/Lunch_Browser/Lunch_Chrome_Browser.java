package Lunch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;


public class Lunch_Chrome_Browser
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\chromedriver.exe");
		
		ChromeDriver chrome=new ChromeDriver();
		
		chrome.get("https://filehippo.com/");
		
		System.out.println(chrome.getTitle());
		
		System.out.println("chrome lunched successfully");
		
		
		
		
		chrome.close();
	}

}
