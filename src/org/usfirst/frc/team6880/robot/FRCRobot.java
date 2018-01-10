package org.usfirst.frc.team6880.robot;

public class FRCRobot {
	Robot wpilibrobot = null;
	
	public FRCRobot(Robot wpilibrobot)
	{
		this.wpilibrobot = wpilibrobot;
	}
	
	public void runTeleOp()
	{
		
	}
	
	public void runAutonomous()
	{
		
	}
	
	public boolean isEnabled()
	{
		return wpilibrobot.isEnabled();
	}
}
