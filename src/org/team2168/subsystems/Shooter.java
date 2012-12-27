package org.team2168.subsystems;

import org.team2168.RobotMap;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem { 
	
	public Victor shootWheel1, shootWheel2;
	public Encoder ShooterEncoder;
	public DoubleSolenoid hood;
	
	private static final double SHOOTER_VOLTAGE = 1.0;
	
	public Shooter() {
		hood = new DoubleSolenoid(RobotMap.hoodSolenoidPortFwd, RobotMap.hoodSolenoidPortReverse);
		shootWheel1 = new Victor(RobotMap.shooter1JagPWM);
		shootWheel2 = new Victor(RobotMap.shooter2JagPWM);
		ShooterEncoder = new Encoder(RobotMap.shooterWheelEncoderID_A,RobotMap.shooterWheelEncoderID_B);
		
		encoderStart();
		
	}
	
	private void encoderStart(){
		ShooterEncoder.setDistancePerPulse(RobotMap.shooterEncoderDistPerTick);
		ShooterEncoder.setReverseDirection(RobotMap.shooterEncoderReverse);
		
		ShooterEncoder.start();
	}
	/**
	 * Convert Units
	 * @return RPM
	 */
	public double getRate(){
		
		return ShooterEncoder.getRate() * (Math.PI * (RobotMap.shooterWheelRadius * 2)) / (60);
	}
	
	private void encoderStop(){
		ShooterEncoder.stop();
	}
	/**
	 * Set the speed that makes the ball turn.
	 * @param speeD - the speed we want to get the ball to turn.
	 */
	public void setPoint(double speed){
		
		if(ShooterEncoder.getRate() < speed){
			shootWheel1.set(SHOOTER_VOLTAGE);
			shootWheel2.set(SHOOTER_VOLTAGE);
		}else{
			shootWheel1.set(0);
			shootWheel2.set(0);
		}
	}
	                                                                                                                                                          
	public void hoodUp(){
		hood.set(DoubleSolenoid.Value.kForward);
	}
	
	public void hoodDown(){
		hood.set(DoubleSolenoid.Value.kReverse);
	}

	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
		
}
