package org.team2168.commands;

import edu.wpi.first.wpilibj.command.Command;

public class HoodDown extends CommandBase {
	
	public void HoodDown(){
		requires(shooter);
	}

	protected void initialize() {

	}

	protected void execute() {
		shooter.hoodDown();
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {

	}

	protected void interrupted() {

	}

}
