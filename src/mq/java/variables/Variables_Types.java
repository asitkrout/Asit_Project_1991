package mq.java.variables;

public class Variables_Types
{
	
	
	int a=100;          //Global Variable [Instant Variable]
	static int b=200;   //Global Variable [Class Variable /Static Variable]
	
	
	public void method1()
	{
		String name="MQ";      //Local Variable
		System.out.println("Local variabel is "+name);
		
		System.out.println("Instant Variable --> "+a);
		System.out.println("Class Variable --> "+b);
		
	}
	
	public void method2()
	{
		System.out.println("Instant Variable --> "+a);
		System.out.println("Class Variable --> "+b);
	}
	
	

	public static void main(String[] args)    //Runnable
	{
		
		//Calling Instant Variable from MainMethod 
		Variables_Types var=new Variables_Types();
		int x=var.a;
		System.out.println("Instant Variable is ---> "+x);
		
		
		//Calling Class Variable From Differnt Class
		int y=Variables_Types.b;
		System.out.println("Class Variable is ---> "+y);
		

	}

}
