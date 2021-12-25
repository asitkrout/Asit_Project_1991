package mq.java.methods;

public class ACremote
{
	void Turnon()
	{
		System.out.println("Turn ON Executed");
	}
	void Turnoff()
	{
		System.out.println("Turn off executed");
	}
	public static void main(String[] args)
	{

		System.out.println("Hello world!!");
		
		new ACremote().Turnon();
		new TVremote().ON();
		new ACremote().Turnoff();
		new TVremote().OFF();
	}

}
