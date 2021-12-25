package mq.java.variables.Constructor_Initiation;

public class Data_Initilization 
{
	
	int a;
	int b;
	
	public Data_Initilization(int x, int y)    //Initializing Data through constructor
	{
		a=x;
		b=y;
	}
	
	public void methodA()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	

	public static void main(String[] args) {
		
		Data_Initilization obj=new Data_Initilization(100, 400);
		obj.methodA();
			

	}

}
