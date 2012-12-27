package org.team2168.subsystems;

import org.team2168.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	
	Victor lv1;
	Victor rv1;
	Victor lv2;
	Victor rv2;
	DoubleSolenoid shifter;
	public DriveTrain() {
		shifter = new DoubleSolenoid(RobotMap.shiftForwardChannel, RobotMap.shiftReverseChannel);
		rv2 = new Victor(RobotMap.rightmotor2);
		lv2 = new Victor(RobotMap.leftmotor2);
		rv1 = new Victor(RobotMap.rightmotor1);
		lv1 = new Victor(RobotMap.leftmotor1);
	}

	
	protected void initDefaultCommand() {
		
	}

	public void setSpeed(double rightspeed, double leftspeed) {		
		if (RobotMap.invertRight == true) {
			rightspeed *= -1;
		}
		if (RobotMap.invertLeft == true) {
			leftspeed = leftspeed * -1;
		}
		
		lv1.set(leftspeed);
		rv1.set(rightspeed);
		lv2.set(leftspeed);
		rv2.set(rightspeed);
	}
}