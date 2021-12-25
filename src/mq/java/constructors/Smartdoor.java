package mq.java.constructors;

public class Smartdoor {

	public Smartdoor()
		{
			System.out.println("Activate door");
		}
	
	public void opendoor()
		{
			System.out.println("Door Opened");
		}
	
	public void closedoor()
		{
			System.out.println("Door Closed");
		}
	public static void main(String[] args)
		{
			new Smartdoor().opendoor();
			new Smartdoor().closedoor();
		}
	

}
