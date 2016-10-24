package org.usfirst.frc2231.Robot2013;

import edu.wpi.first.wpilibj.CANTalon;

public class OnyxCANTalon extends CANTalon {

	private double precentTolerance;
	private double absoluteTolerance;
	private double distancePerPulse;

	public boolean isOnTarget() {
		if (Math.abs(super.get() - super.getSetpoint()) <= absoluteTolerance
				|| Math.abs(super.get() / super.getSetpoint() - 1) <= precentTolerance)
			return true;
		return false;

	}

	public double getDistance() {
		return super.get() * distancePerPulse;
	}

	public void setDistanceSetPoint(double setPoint) {
		super.setSetpoint(setPoint * distancePerPulse);
	}

	public double getPrecentTolerance() {
		return precentTolerance;
	}

	public void setPrecentTolerance(double precentTolerance) {
		this.precentTolerance = precentTolerance;
	}

	public double getAbsoluteTolerance() {
		return absoluteTolerance;
	}

	public void setAbsoluteTolerance(double absoluteTolerance) {
		this.absoluteTolerance = absoluteTolerance;
	}

	public OnyxCANTalon(int deviceNumber) {
		super(deviceNumber);
		// TODO Auto-generated constructor stub
	}

	public double getDistancePerPulse() {
		return distancePerPulse;
	}

	public void setDistancePerPulse(double distancePerPulse) {
		this.distancePerPulse = distancePerPulse;
	}

}
