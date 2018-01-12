package org.usfirst.frc.team6880.robot.task;

import org.usfirst.frc.team6880.robot.FRCRobot;

public class TaskTurnLeft90deg implements RobotTask {
	FRCRobot robot;
	double endDirection;
	double currentDirection;
	boolean wrapNegYaw;
	
	public TaskTurnLeft90deg(FRCRobot robot) 
	{
		this.robot = robot;
	}
	
	public void initTask()
	{
		//Calculate the end direction
		endDirection = robot.navigation.gyro.getYaw() + 90.0;
		//If the end direction is above 180, we need to take the negative yaw values and wrap them to positive
		if (endDirection > 180.0)
		{
			wrapNegYaw = true;
		}
		else
		{
			wrapNegYaw = false;
		}
		//Start turning at half speed
		robot.driveSys.arcadeDrive(0.5, -1.0);
	}
	
	public boolean runTask()
	{
		//Store current direction to minimize method calls
		currentDirection = robot.navigation.gyro.getYaw();
		//If robot hasn't turned 90 deg
		if ((wrapNegYaw && currentDirection < 0 ? currentDirection + 360 : currentDirection) < endDirection)
		{
			//Keep on turning by leaving motors at their current values
			return false;
		}
		//Else stop the robot and tell robot to go to next task
		robot.driveSys.tankDrive(0.0, 0.0);
		return true;
	}
}
