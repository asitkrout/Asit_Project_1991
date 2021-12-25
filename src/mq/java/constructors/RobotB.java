package mq.java.constructors;

public class RobotB
{
		void walk()
		{
			System.out.println("Walk completed in 5 km");
		}
		void customwalk(int speed)
		{
			System.out.println("walk completed in speed-->"+speed);
		}
		public static void main(String [] args)
		{
			new RobotB().walk();
			new RobotB().customwalk(10);
			new RobotB().customwalk(8);
		}
}
