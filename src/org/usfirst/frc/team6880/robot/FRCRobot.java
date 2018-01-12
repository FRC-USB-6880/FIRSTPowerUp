package org.usfirst.frc.team6880.robot;

import org.usfirst.frc.team6880.robot.driveTrain.DriveSystem;
import org.usfirst.frc.team6880.robot.navigation.Navigation;
import org.usfirst.frc.team6880.robot.task.*;

public class FRCRobot {
	Robot wpilibrobot;
	public DriveSystem driveSys;
	public Navigation navigation;
	
	RobotTask curTask;
	RobotTask tasks [] = {new TaskMoveForward20m(this),
						  new TaskTurnLeft90deg(this),
						  new TaskMoveForward20m(this),
						  new TaskTurnLeft90deg(this),
						  new TaskMoveForward20m(this),
						  new TaskTurnLeft90deg(this),
						  new TaskMoveForward20m(this)};
	int taskNum;
	
	public FRCRobot(Robot wpilibrobot)
	{
		this.wpilibrobot = wpilibrobot;
		driveSys = new DriveSystem(this);
	}
	
	public void runTeleOp()
	{
		//TODO: Map controller sticks to drive system
		//Possible: map misc. controller buttons to tasks?
	}
	
	public void initAutonomous()
	{
		//Start with first task
		curTask = tasks[0];
		taskNum = 0;
	}
	
	public void runAutonomous()
	{
		//Run the current task. If current task ended
		if(curTask.runTask())
		{
			//Go to next state
			curTask = tasks[++taskNum];
			curTask.initTask();
		}
	}
		
	public boolean isEnabled()
	{
		return wpilibrobot.isEnabled();
	}
}
