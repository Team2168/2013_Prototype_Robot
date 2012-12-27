package org.team2168.commands;

import edu.wpi.first.wpilibj.command.Command;

public class HoodUp extends CommandBase {
	
	public HoodUp(){
		requires(shooter);
	}

	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		// TODO Auto-generated method stub
		shooter.hoodUp();
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
