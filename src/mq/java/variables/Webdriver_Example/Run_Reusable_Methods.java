package mq.java.variables.Webdriver_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class Run_Reusable_Methods 
{
	
	

	public static void main(String[] args) throws Exception 
	{
		Reusable_Methods obj=new Reusable_Methods();
		obj.lunch_Browser();
		//obj.loadpage();
		obj.user_Login();
		obj.capturescreen("Orange_HRM_Demo");
		
		
	}

}
