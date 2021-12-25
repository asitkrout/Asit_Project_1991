package mq.java.variables;

public class Variable_Runtime_Changes
{
	int a=100;
	String name="Sunil";
	

	public static void main(String[] args) 
	{
		Variable_Runtime_Changes obj=new Variable_Runtime_Changes();
		
		int a1=obj.a=200;
		System.out.println("a value after change-->"+a1);
		
		String name1=obj.name="Pranil";
		System.out.println("sunil name after changing--->"+name1);
		
		
		
		
		
		
		
		
		
		

	}

}
