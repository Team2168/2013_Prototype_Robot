package org.team2168.subsystems;

import org.team2168.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class KnockDown extends Subsystem {
	DoubleSolenoid KnockDown;
	
	public KnockDown(){
		KnockDown = new DoubleSolenoid(RobotMap.bridgeArmSolenoidForwardChannel,
				RobotMap.bridgeArmSolenoidReverseChannel);
	}
	
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void knockDownRaise(){
		KnockDown.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void knockDownLower(){
		KnockDown.set(DoubleSolenoid.Value.kForward);
	}
	

}
