package Lunch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lunch_Edge_Browser
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\Testing Sw\\Browser Webdrives\\msedgedriver.exe");
		
		EdgeDriver edge=new EdgeDriver();
		
		edge.get("https://filehippo.com/");
		
		System.out.println(edge.getTitle());
		
		System.out.println("Edge lunched successfully");
		
		edge.close();
	}

}