package mq.java.methods.parameters;

public class RobotE
{
	public void run()
	{
		System.out.println("run completed in 5 km speed");
	}
	
	public void custom_run(int km)
	{
		System.out.println(km+"<-- speed completed");
	}
	public void methodA(int a, int b)
	{
		int c=a+b;
		System.out.println("Total-->"+c);
	}
	public static void main(String[] args)
	{
			RobotE RE=new RobotE();
			RE.run();
			RE.custom_run(10);
			RE.methodA(10, 18);
	}

}
