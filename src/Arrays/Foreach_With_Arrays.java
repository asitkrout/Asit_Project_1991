package Arrays;

public class Foreach_With_Arrays {

	public static void main(String[] args) 
	{
		String browser[]= {"chrome","safari","edge","ie","firefox","opera"};
		System.out.println(browser[0]);
		
		for (String EachBrowser : browser) 
		{
			System.out.println(EachBrowser);
		}
		
		
		String data[][]= {
				{"ajya","ajay@123"},
				{"asit","asit@123"},
				{"papu","papu@123"}
			};
		
		for (String[] arr : data) 
		{
			for (String EachData : arr) 
			{
				System.out.println(EachData);
			}
		}
		
		String info[][]=new String[3][2];
		info[0][0]="Asit";
		info[0][1]="@arjun123";
		
		info[1][0]="Raj";
		info[1][1]="Raj123";
		
		info[2][0]="papu";
		info[2][1]="papu123";
		
		for (String[] inf : info) 
		{
			for (String EachInfo : inf) 
			{
				System.out.println(EachInfo);
			}
		}
		
		
		
		
		
		
		
	}

}
