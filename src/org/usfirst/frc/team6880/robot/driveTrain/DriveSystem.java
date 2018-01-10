package org.usfirst.frc.team6880.robot.driveTrain;

import org.usfirst.frc.team6880.robot.FRCRobot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveSystem {
	FRCRobot robot;
	VictorSP motorL1;
	VictorSP motorL2;
	VictorSP motorR1;
	VictorSP motorR2;
	Encoder leftEnc;
	Encoder rightEnc;
	DifferentialDrive drive;

	private static final double WHEEL_DIAMETER = 6.0;
	private static final double WHEEL_CIRCUMFERENCE = Math.PI * WHEEL_DIAMETER;
	private static final double DISTANCE_PER_PULSE = WHEEL_CIRCUMFERENCE / 1440.0;
	public static final double DRIVE_TRAIN_RADIUS = 27.6772 / 2;
	
	public DriveSystem(FRCRobot robot)
	{
		this.robot = robot;
		motorL1 = new VictorSP(0);
		motorL2 = new VictorSP(1);
		motorR1 = new VictorSP(2);
		motorR2 = new VictorSP(3);
		leftEnc = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
		leftEnc.setDistancePerPulse(DISTANCE_PER_PULSE);
		rightEnc = new Encoder(2, 3, true, Encoder.EncodingType.k4X);
		rightEnc.setDistancePerPulse(DISTANCE_PER_PULSE);
	}
	
	public void tankDrive(double leftSpeed, double rightSpeed) {
		drive.tankDrive(leftSpeed, rightSpeed);
	}
	//TODO: Basically everything to do with moving
}
