// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2231.Robot2013;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.vision.AxisCamera;
import edu.wpi.first.wpilibj.vision.USBCamera;
import edu.wpi.first.wpilibj.vision.AxisCamera.Resolution;
import FRC_Vision2016_newMethods_ft_team2231.OnyxTronixPIDController;
import FRC_Vision2016_newMethods_ft_team2231.VisionSensor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainFirstLeft;
    public static CANTalon driveTrainSecondLeft;
    public static CANTalon driveTrainFirstRight;
    public static CANTalon driveTrainSecondRight;
    public static RobotDrive driveTrainRobotDrive4;
    public static AnalogGyro driveTrainrotationGyro;
    public static AnalogPotentiometer shooterPitchPotentiometer;
    public static DoubleSolenoid shooterTriggerSolenoid;
    public static CANTalon shooterAimingMotor;
    public static CANTalon shooterShootingWheel;
    public static DoubleSolenoid climbingRightSolenoid;
    public static DoubleSolenoid climbingLeftSolenoid;
    public static Compressor climbingCompressor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static AxisCamera shooterCamera;
    public static USBCamera driveCamera;
    public static ADXRS450_Gyro visionGyro;
    public static PIDController shooterPIDController;
	// Vision PIDControllers
	public static OnyxTronixPIDController VisionLeftPIDController;
	public static OnyxTronixPIDController VisionRightPIDController;

	// DriveTrain PIDControllers
	public static OnyxTronixPIDController driveTrainLeftPIDController;
	public static OnyxTronixPIDController driveTrainRightPIDController;
	public static VisionSensor visionSensor;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainFirstLeft = new CANTalon(0);
        LiveWindow.addActuator("DriveTrain", "FirstLeft", driveTrainFirstLeft);
        
        driveTrainSecondLeft = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "SecondLeft", driveTrainSecondLeft);
        
        driveTrainFirstRight = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "FirstRight", driveTrainFirstRight);
        
        driveTrainSecondRight = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "SecondRight", driveTrainSecondRight);
        
        driveTrainRobotDrive4 = new RobotDrive(driveTrainFirstLeft, driveTrainSecondLeft,
              driveTrainFirstRight, driveTrainSecondRight);
        
        driveTrainRobotDrive4.setSafetyEnabled(false);
        driveTrainRobotDrive4.setExpiration(0.1);
        driveTrainRobotDrive4.setSensitivity(0.2);
        driveTrainRobotDrive4.setMaxOutput(1.0);

        driveTrainRobotDrive4.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainRobotDrive4.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        driveTrainrotationGyro = new AnalogGyro(1);
        LiveWindow.addSensor("DriveTrain", "rotationGyro", driveTrainrotationGyro);
        driveTrainrotationGyro.setSensitivity(0.007);
        shooterPitchPotentiometer = new AnalogPotentiometer(0, 1.0, 0.0);
        LiveWindow.addSensor("Shooter", "PitchPotentiometer", shooterPitchPotentiometer);
        
        shooterTriggerSolenoid = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("Shooter", "TriggerSolenoid", shooterTriggerSolenoid);
        
        shooterAimingMotor = new CANTalon(11);
        LiveWindow.addActuator("Shooter", "AimingMotor", shooterAimingMotor);
        
        shooterShootingWheel = new CANTalon(4);
        LiveWindow.addActuator("Shooter", "ShootingWheel", shooterShootingWheel);
        
        climbingRightSolenoid = new DoubleSolenoid(0, 4, 5);
        LiveWindow.addActuator("Climbing", "RightSolenoid", climbingRightSolenoid);
        
        climbingLeftSolenoid = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("Climbing", "LeftSolenoid", climbingLeftSolenoid);
        
        climbingCompressor = new Compressor(0);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        /********************************* Vision Camera ********************************/
        
        shooterCamera = new AxisCamera("10.22.31.12");
        shooterCamera.writeResolution(Resolution.k640x480);

        /********************************* Shooter PID *********************************/
        shooterPIDController = new PIDController(StaticMembers.ShooterP, StaticMembers.ShooterI, StaticMembers.ShooterD, shooterShootingWheel, shooterShootingWheel);
        LiveWindow.addActuator("Shooter", "PIDController", shooterPIDController);
        shooterPIDController.setContinuous(false);
        shooterPIDController.setAbsoluteTolerance(StaticMembers.ABSOLUTE_TOLERANCE_ROTATION);
        shooterPIDController.setOutputRange(StaticMembers.OUT_PUT_RANGE_MIN, StaticMembers.OUT_PUT_RANGE_MAX);
        
        /********************************* DriveTrain PID *********************************/
       
        /*
         * //TODO: add encoder
        driveTrainLeftPIDController = new PIDController(StaticMembers.ROBOTDRIVE_P, StaticMembers.ROBOTDRIVE_I,StaticMembers.ROBOTDRIVE_D, driveTrainFirstLeft, driveTrainFirstLeft);
        LiveWindow.addActuator("DriveTran", "SecondLeftPIDController", driveTrainLeftPIDController);
        driveTrainLeftPIDController.setContinuous(false);
        driveTrainLeftPIDController.setAbsoluteTolerance(StaticMembers.ABSOLUTE_TOLERANCE);
        driveTrainLeftPIDController.setOutputRange(StaticMembers.OUT_PUT_RANGE_MIN, StaticMembers.OUT_PUT_RANGE_MAX);
        */
        
        driveTrainRightPIDController = new OnyxTronixPIDController(StaticMembers.DriveP, StaticMembers.DriveI,StaticMembers.DriveD, driveTrainFirstRight, driveTrainFirstRight);
        LiveWindow.addActuator("DriveTran", "SecondRightPIDController", driveTrainRightPIDController);
        driveTrainRightPIDController.setContinuous(false);
        driveTrainRightPIDController.setAbsoluteTolerance(StaticMembers.ABSOLUTE_TOLERANCE_ROTATION);
        driveTrainRightPIDController.setOutputRange(StaticMembers.OUT_PUT_RANGE_MIN, StaticMembers.OUT_PUT_RANGE_MAX);  
        
        /********************************* Vision PID *********************************/
        
        visionSensor = new VisionSensor(shooterCamera, StaticMembers.ANGLE_TO_FLOUR, StaticMembers.ROBOT_HIEGHT, StaticMembers.TARGET_HIEGHT);

        VisionLeftPIDController = new OnyxTronixPIDController(StaticMembers.visionP, StaticMembers.visionI, StaticMembers.visionD, visionSensor, driveTrainFirstLeft);
        LiveWindow.addActuator("Vision", "LeftPIDController", VisionLeftPIDController);
        VisionLeftPIDController.setContinuous(false);
        VisionLeftPIDController.setAbsoluteTolerance(StaticMembers.ABSOLUTE_TOLERANCE_ROTATION);
        VisionLeftPIDController.setOutputRange(StaticMembers.OUT_PUT_RANGE_MIN, StaticMembers.OUT_PUT_RANGE_MAX);     
    	
        VisionRightPIDController = new OnyxTronixPIDController(StaticMembers.visionP, StaticMembers.visionI, StaticMembers.visionD, visionSensor, driveTrainFirstRight);
        LiveWindow.addActuator("Vision", "RightPIDController", VisionRightPIDController);
        VisionRightPIDController.setContinuous(false);
        VisionRightPIDController.setAbsoluteTolerance(StaticMembers.ABSOLUTE_TOLERANCE_ROTATION);
        VisionRightPIDController.setOutputRange(StaticMembers.OUT_PUT_RANGE_MIN, StaticMembers.OUT_PUT_RANGE_MAX);
    }
}
