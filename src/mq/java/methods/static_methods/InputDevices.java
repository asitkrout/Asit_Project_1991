package mq.java.methods.static_methods;

public class InputDevices 
{
	public static void mouse()
	{
		System.out.println("mouse active");
	}
	
	public static void keyboard()
	{
		System.out.println("keyboard active");
	}
	public static void touch()
	{
		System.out.println("touch feature is active");
	}

	public static void main(String[] args) 
	{
		mouse();
		touch();
		keyboard();
	}

}
