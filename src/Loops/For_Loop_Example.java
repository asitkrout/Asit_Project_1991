package Loops;

public class For_Loop_Example {

	public static void main(String[] args) 
	{
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("numbers"+i);
		}
		
		for (int i = 100; i >= 90; i--)
		{
			System.out.println("Hello"+i);
		}
		
		String tools[]= {"ide","webdriver","webelement","cucumber","maven","api"};
		for (int i = 0; i < tools.length; i++) {
			String toolname = tools[i];
			System.out.println(toolname);
		}
		
		
		
		
		
	}

}
