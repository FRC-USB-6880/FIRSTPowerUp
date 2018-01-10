package org.usfirst.frc.team6880.robot;

import org.usfirst.frc.team6880.robot.driveTrain.DriveSystem;

public class FRCRobot {
	Robot wpilibrobot;
	DriveSystem driveSys;
	
	enum Task {MovingForward20m, TurningLeft90deg};
	Task curTask;
	Task tasks [] = {Task.MovingForward20m,
					  Task.TurningLeft90deg,
					  Task.MovingForward20m,
					  Task.TurningLeft90deg,
					  Task.MovingForward20m,
					  Task.TurningLeft90deg,
					  Task.MovingForward20m};
	int taskNum;
	
	public FRCRobot(Robot wpilibrobot)
	{
		this.wpilibrobot = wpilibrobot;
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
		taskNum = 1;
	}
	
	public void runAutonomous()
	{
		switch (curTask)
		{
		case MovingForward20m:
			//TODO: If 20m reached
			if (true)
				//TODO: Go to next task
				changeState();
			break;
		case TurningLeft90deg:
			//TODO: If 90deg reached
			if (true)
				//TODO: Go to next task
				changeState();
		}
	}
	
	public void changeState() {
		//Go to next state
		curTask = tasks[++taskNum];
		switch (curTask)
		{
		case MovingForward20m:
			//TODO: Start driving forward
			//TODO: Get encoder val, set target encoder val
		break;
		case TurningLeft90deg:
			//TODO: Start turning
			//TODO: Get orientation, set target orientation
		}
	}
	
	public boolean isEnabled()
	{
		return wpilibrobot.isEnabled();
	}
}
