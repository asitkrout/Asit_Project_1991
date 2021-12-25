package mq.java.constructors;

public class Change_gear {

	public Change_gear() 
		{
			System.out.println("Hold the Clutch");
		}
	public void Gear1()
		{
			System.out.println("First Gear Changed");
		}
	public void Gear2()
		{
			System.out.println("Second Gear Changed");
		}
	public void Gear3()
		{
			System.out.println("Third Gear Changed");
		}
	public void Gear4()
		{
			System.out.println("Fourth Gear Changed");
		}
	public void main(String[] args)
	{
		new Change_gear().Gear1();
		new Change_gear().Gear2();
		new Change_gear().Gear3();
		new Change_gear().Gear4();
		
		Change_gear obj=new Change_gear();
		obj.Gear1();
		obj.Gear2();
		
	}
}
