package org.team2168.commands;

import edu.wpi.first.wpilibj.command.Command;

public class HoodUp extends CommandBase {
	
	public HoodUp(){
		requires(shooter);
	}

	protected void initialize() {

	}

	protected void execute() {
		shooter.hoodUp();
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {

	}

	protected void interrupted() {

	}

}
