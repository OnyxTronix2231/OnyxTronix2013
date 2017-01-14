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
	public static final double ABSOLUTE_TOLERANCE_DISTANCE = 0.1 / 1000.0;
	public static final double PERCENT_TOLERANCE = 10;		
	public static final double OUT_PUT_RANGE_MAX = 0.4;
	public static final double OUT_PUT_RANGE_MIN = -0.4;

	//RobotDrive
	public static final int DEFAULT_POV_VALUE = -1;
	public static final int PULSE_SCALE = 360;
	public static final int  DIRECTION_VALUE = 1;
	public static double driveP = 80;
	public static double driveI = 0.0;
	public static double driveD = 500;
	public static double driveF = 0.1;
	public static double driveSetPoint = 0 / 1000.0;
	
	//Vision
	public static final double ANGLE_TO_FLOUR = 32;
	public static final double TARGET_HIEGHT = 0.83;
	public static final double ROBOT_HIEGHT = 0.38;
	public static final int HUE_LOW = 78;
	public static final int HUE_HIGH = 129;
	public static final int SATURATION_LOW = 91;
	public static final int SATURATION_HIGH = 255;
	public static final int VALUE_LOW = 93;
	public static final int VALUE_HIGH = 255;
	public static final double VERTICAL_APERTURE_ANGLE = 36.12;
	public static final double MIN_AREA = 200; //The min area(in pixels) of an object in the processing operation
	public static final double MAX_AREA = 10000000; // The max area(in pixels) of an object in the processing operation
	public static double visionP = 0.500;
	public static double visionI = 0.002;
	public static double visionD = 20.000;
	public static double visionF = 0.28;
	public static double visionSetPoint = -0.022;
		
	//Shooter
	public static double ShooterP = 0.07;
	public static double ShooterI = 0.0;
	public static double ShooterD = 0.03;
		
	
}
