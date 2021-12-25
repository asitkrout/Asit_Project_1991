package mq.java.methods.instant_methods;

public class RobotC 
{
	public void walk()
	{
		System.out.println("walk executed");
	}
	
	public void run()
	{
		System.out.println("run executed");
	}

	public void jump()
	{
		System.out.println("jump executed");
	}
	public static void main(int i) 
	{
		RobotC obj=new RobotC();
		obj.walk();
		obj.run();
		obj.jump();
		

	}

}
