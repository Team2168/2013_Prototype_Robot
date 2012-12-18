package org.team2168.subsystems;

import org.team2168.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.AnalogChannel;
	//WASH THE DISHES
	//LAVAR LOS PLATOS

public class Lift extends Subsystem {
	double voltage;
	Victor liftVictor1 = new Victor(RobotMap.lift1Victor);
	Victor liftVictor2 = new Victor(RobotMap.lift2Victor);
	DoubleSolenoid backFlapSolenoid = new DoubleSolenoid(RobotMap.backFlapSolenoidOpen, RobotMap.backFlapSolenoidClose);
	AnalogChannel anlgChnlUpper = new AnalogChannel(RobotMap.ballDetectorUpper);
	
	public Lift () {
		
	}
	
	public Lift(double voltage) {
		this.voltage = voltage;
	}

	public boolean ballPresent() {
		boolean ret = false;
		double anlgChnlVoltage = anlgChnlUpper.getVoltage();
		if (anlgChnlVoltage <= RobotMap.ballPresentVoltage) {
			ret = true;
		}
		return ret;
	}

	
	protected void initDefaultCommand() {

		
	}
	
	public void liftUp() {
		liftVictor1.set(RobotMap.liftVoltage);
		liftVictor2.set(RobotMap.liftVoltage);
	}
	
	public void liftDown() {
		liftVictor1.set(-RobotMap.liftVoltage);
		liftVictor2.set(-RobotMap.liftVoltage);
	}
	
	public void stopLift() {
		liftVictor1.stopMotor();
		liftVictor2.stopMotor();
	}
	//¿COMO ESTAS?
	//THIS IS THE HOPPER LOLOLLLLLLL
	public void openBackFlap() {
		backFlapSolenoid.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void closeBackFlap() {
		backFlapSolenoid.set(DoubleSolenoid.Value.kForward);
	}

}
