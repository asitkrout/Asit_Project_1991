package mq.java.variables.Method_Initiation;

public class Method_parameter 
{
	
	int a;
	int b;
	
	//Here method is initlilize data to global varible
	public void mehtodA(int x , int y)
	{
		a=x;
		b=y;
	}
	
	

	public static void main(String[] args) {
		
		Method_parameter obj=new Method_parameter();
		obj.mehtodA(101,105);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
