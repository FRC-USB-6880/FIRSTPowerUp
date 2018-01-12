package org.usfirst.frc.team6880.robot.task;

import org.usfirst.frc.team6880.robot.FRCRobot;

public class TaskTurnLeft90deg implements RobotTask {
	FRCRobot robot;
	
	public TaskTurnLeft90deg(FRCRobot robot) 
	{
		this.robot = robot;
	}
	
	public void initTask()
	{
		robot.driveSys.tankDrive(-1.0, 1.0);
	}
	
	public boolean runTask()
	{
		//If 
		if (true)
		{
			return true;
		}
		return false;
	}
}
