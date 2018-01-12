package org.usfirst.frc.team6880.robot.task;

import org.usfirst.frc.team6880.robot.FRCRobot;

public class TaskMoveForward20m implements RobotTask {
	FRCRobot robot;
	double initialDist;
	
	public TaskMoveForward20m(FRCRobot robot) {
		this.robot = robot;
	}
	
	public void initTask()
	{
		//Get initial encoder distances
		initialDist = robot.driveSys.getDist();
		//Set motor power levels
		robot.driveSys.tankDrive(1.0, 1.0);
	}
	
	public boolean runTask()
	{
		//If traveled 20m
		if (robot.driveSys.getDist() - initialDist >= 20)
		{
			//Tell robot to go to next task
			return true;
		}
		//Else stay straight
		return false;
	}
}
