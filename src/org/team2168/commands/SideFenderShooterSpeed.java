package org.team2168.commands;

import org.team2168.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class SideFenderShooterSpeed extends CommandBase {

	public void SideFenderShooterSpeed(){
		requires(shooter);
	}
	
	protected void initialize() {

	}

	protected void execute() {
		shooter.setPoint(RobotMap.HIGH_GOAL_SIDE);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {

	}

	protected void interrupted() {

	}

}
