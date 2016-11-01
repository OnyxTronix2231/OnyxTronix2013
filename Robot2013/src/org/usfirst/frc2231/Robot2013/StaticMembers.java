package org.usfirst.frc2231.Robot2013;

public class StaticMembers {
	
	public static boolean isEmergencyState = true;
	
	//PID Parameters
	public static final double DISTANCE_PER_PULSE = 0.5;
	public static final double ABSOLUTE_TOLERANCE = 3;
	public static final double PERCENT_TOLERANCE = 10;	
	
	public static final double OUT_PUT_RANGE_MAX = 0.4;
	public static final double OUT_PUT_RANGE_MIN = -0.4;
	
	public static final double ROBOTDRIVE_P = 0.07;
	public static final double ROBOTDRIVE_I = 0.0;
	public static final double ROBOTDRIVE_D = 0.03;
	
	public static final double VISION_P = 0.07;
	public static final double VISION_I = 0.0;
	public static final double VISION_D = 0.03;
	public static final double VISION_SETPOINT = 0;

	
	//Robot Ratios
	public static final double ROBOT_RADIUS = 35;
	public static final double WHEEL_RADIUS = 3;
	public static final double INCH = 2.54;
	public static final double WHEEL_PERIMETER = WHEEL_RADIUS * INCH * 2 * Math.PI;
	public static final double ROBOT_PERIMETER = ROBOT_RADIUS * INCH * 2 * Math.PI;
	
	//RobotDrive Parameters
	public static final int DEFAULT_POV_VALUE = -1;
	public static final int PULSE_SCALE = 360;
	public static final int  DIRECTION_VALUE = 1;
}
