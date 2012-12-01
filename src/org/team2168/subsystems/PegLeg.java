package org.team2168.subsystems;

import org.team2168.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PegLeg extends Subsystem {
	Relay pegLeg;
	
	public PegLeg() {
		pegLeg = new Relay(RobotMap.PegLegRelay);
	}

	protected void initDefaultCommand() {

	}

	public void pegLegDown() {
		pegLeg.set(Relay.Value.kOn);
	}
	
	public void pegLegUp(){
		pegLeg.set(Relay.Value.kOff);
	}
	
}
