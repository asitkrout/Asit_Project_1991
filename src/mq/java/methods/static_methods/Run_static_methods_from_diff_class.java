package mq.java.methods.static_methods;

import mq.java.methods.instant_methods.RobotC;

public class Run_static_methods_from_diff_class
{

	public static void main(String[] args)
	{
		InputDevices.mouse();
		InputDevices.keyboard();
		InputDevices.touch();
		RobotC RC=new RobotC();
		RC.run();
		RC.jump();
	}

}
