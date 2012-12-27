package org.team2168.commands;

import edu.wpi.first.wpilibj.command.Command;

public class HoodDown extends CommandBase {
	
	public void HoodDown(){
		requires(shooter);
	}

	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		// TODO Auto-generated method stub
		shooter.hoodDown();
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
