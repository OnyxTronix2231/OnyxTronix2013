// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2231.Robot2013.commands;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2231.Robot2013.Robot;
import org.usfirst.frc2231.Robot2013.RobotMap;

import sensors.PIDVisionSourceType;

/**
 *
 */
public class PrintVisionDistance extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public PrintVisionDistance() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//RobotMap.visionSensor.startProcessing(PIDVisionSourceType.DistanceFromTarget, 2);
    	

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//System.out.println("Distance: " + RobotMap.visionSensor.pidGet());
    	System.out.println("X: " + RobotMap.accelometer.getX());
    	System.out.println("Y: " + RobotMap.accelometer.getY());
    	System.out.println("Z: " + RobotMap.accelometer.getZ());
    	
    	System.out.println(Math.toDegrees(Math.atan(RobotMap.accelometer.getZ() / RobotMap.accelometer.getY())));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.visionSensor.stopProcessing();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
