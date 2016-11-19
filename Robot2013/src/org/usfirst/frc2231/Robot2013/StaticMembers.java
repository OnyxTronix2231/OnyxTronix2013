package org.usfirst.frc2231.Robot2013;

public class StaticMembers {
	
	public static boolean isEmergencyState = true;

	//Robot Ratios
	public static final double ROBOT_RADIUS = 35;
	public static final double WHEEL_RADIUS = 3;
	public static final double INCH = 2.54;
	public static final double WHEEL_PERIMETER = WHEEL_RADIUS * INCH * 2 * Math.PI;
	public static final double ROBOT_PERIMETER = ROBOT_RADIUS * INCH * 2 * Math.PI;
	
	//PID Parameters
	public static final double DISTANCE_PER_PULSE = 0.5;
	public static final double ABSOLUTE_TOLERANCE_ROTATION =  10 / 1000.0;
	public static final double ABSOLUTE_TOLERANCE_DISTANCE = 0.05;
	public static final double PERCENT_TOLERANCE = 10;		
	public static final double OUT_PUT_RANGE_MAX = 0.7;
	public static final double OUT_PUT_RANGE_MIN = -0.7;

	//RobotDrive
	public static final int DEFAULT_POV_VALUE = -1;
	public static final int PULSE_SCALE = 360;
	public static final int  DIRECTION_VALUE = 1;
	public static double DriveP = 0.07;
	public static double DriveI = 0.0;
	public static double DriveD = 0.03;
	
	//Vision
	public static final double ANGLE_TO_FLOUR = 28;
	public static final double TARGET_HIEGHT = 1.24;
	public static final double ROBOT_HIEGHT = 0.38;
	public static double visionP = 2.000;
	public static double visionI = 0.000;
	public static double visionD = 10.000;
	public static double visionF = 0.20;
	public static double visionSetPoint = -0.032;
		
	//Shooter
	public static double ShooterP = 0.07;
	public static double ShooterI = 0.0;
	public static double ShooterD = 0.03;
		
	
}
