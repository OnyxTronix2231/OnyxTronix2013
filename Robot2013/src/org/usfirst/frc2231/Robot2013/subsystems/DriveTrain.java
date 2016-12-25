// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2231.Robot2013.subsystems;

import org.usfirst.frc2231.Robot2013.RobotMap;
import org.usfirst.frc2231.Robot2013.StaticMembers;
import org.usfirst.frc2231.Robot2013.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon firstLeft = RobotMap.driveTrainFirstLeft;
    private final CANTalon secondLeft = RobotMap.driveTrainSecondLeft;
    private final CANTalon firstRight = RobotMap.driveTrainFirstRight;
    private final CANTalon secondRight = RobotMap.driveTrainSecondRight;
    private final RobotDrive robotDrive4 = RobotMap.driveTrainRobotDrive4;
    private final AnalogGyro rotationGyro = RobotMap.driveTrainrotationGyro;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public double currentAngle = 0;
    public boolean isStable;
	public int directionValue = 1;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DriveWithJoystick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void arcadeDrive(Joystick stick) {
		robotDrive4.arcadeDrive(
				-stick.getRawAxis(1),
				stick.getRawAxis(4));
	}
    
    public void resetTalonControlMode(){
    	firstLeft.changeControlMode(TalonControlMode.PercentVbus);
    	secondLeft.changeControlMode(TalonControlMode.PercentVbus);
    	firstRight.changeControlMode(TalonControlMode.PercentVbus);
    	secondRight.changeControlMode(TalonControlMode.PercentVbus);

    }
    
    public void changeControlModeToFollow(){
    	secondLeft.changeControlMode(TalonControlMode.Follower);
    	secondRight.changeControlMode(TalonControlMode.Follower);    	
    	firstLeft.changeControlMode(TalonControlMode.Follower);// TODO : Remove Line when there are 2 encoders
    	
    	secondLeft.set(firstRight.getDeviceID()); // TODO : When there are 2 encoders change to firstLeft.getDeviceID()
    	secondRight.set(firstRight.getDeviceID());
    	firstLeft.set(firstRight.getDeviceID()); // TODO : Remove Line when there are 2 encoders
   }
    
    public void setPIDSourceType(PIDSourceType sourceType){ // TODO: Add encoder
    	secondLeft.setPIDSourceType(sourceType);
    }
	
	public void changeTalonControlMode(TalonControlMode mode) {
		secondLeft.changeControlMode(mode);
		secondRight.changeControlMode(mode);
		//firstRight.changeControlMode(mode);
		
		if(mode == TalonControlMode.Follower){
		secondLeft.set(firstLeft.getDeviceID());
		secondRight.set(firstRight.getDeviceID());
		//firstRight.set(firstLeft.getDeviceID());
		}
	}
	
	//Because three talons follows one talon, one side of the robot drive needs to be inverted so the robot will be able to rotate.
	public void setTalonsReversedState(boolean isReversed){
		firstLeft.setInverted(isReversed);
	}
	
	public double getMove(double degrees) {
		return getRotate(degrees + 270.0);
	}

	public double getRotate(double degrees) {
		int shift;
		double shiftedDegree;
		boolean signRotate = Math.floor(degrees / 180) % 2 == 0;
		shift = ((int) degrees) / 180;
		shiftedDegree = degrees - 180 * shift;
		if (signRotate) {
			return 1 - shiftedDegree / 90.0;
		} else {
			return -(1 - shiftedDegree / 90.0);
		}
	}	
	
	/*Checks if the robot should turn either left or right*/
	public boolean isClockwiseRotationEfficient(double setpoint) { 
		if (setpoint - RobotMap.driveTrainFirstLeft.getPosition() > StaticMembers.WHEEL_PERIMETER / 2) {
			return true;
		}
		return false;
	}
	
	public boolean isStable(){
		isStable = this.currentAngle < rotationGyro.getAngle();
		Timer.delay(100);
		this.currentAngle = rotationGyro.getAngle();
		return isStable;	
	}

}

