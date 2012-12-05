package org.team2168.subsystems;

import org.usfirst.frc2168.RobotMap;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Relay;

public class Shooter { 
	
	public Victor shootWheel1;
	public Encoder ShooterEncoder;
	 
	public Relay hoodUP;
	public Relay hoodDW;
	
	private static final double SHOOTER_VOLTAGE = 1.0;
	
	public Shooter() {
		
		// TODO Auto-generated constructor stub
		hoodUP = new Relay(RobotMap.hoodSolenoidPortFwd);
		hoodDW = new Relay(RobotMap.hoodSolenoidPortReverse);
		shootWheel1 = new Victor(RobotMap.shooterWheelCANID); //TODO: CHANGE TO PWM
		ShooterEncoder = new Encoder(RobotMap.shooterWheelEncoderID_A,RobotMap.shooterWheelEncoderID_B);
		
		encoderStart();
		
	}
	
	private void encoderStart(){
		ShooterEncoder.setDistancePerPulse(RobotMap.shooterEncoderDistPerTick);
		ShooterEncoder.setReverseDirection(RobotMap.shooterEncoderReverse);
		
		ShooterEncoder.start();
	}
	
	public double getRate(){
		
		return ShooterEncoder.getRate();
	}
	
	private void encoderStop(){
		ShooterEncoder.stop();
	}
	/**
	 * Set the speed that makes the ball turn.
	 * @param speeD - the speed we want to get the ball to turn.
	 */
	public void setPoint(int speed){
		
		if(ShooterEncoder.getRate() < speed){
			shootWheel1.set(SHOOTER_VOLTAGE);
		}else{
			shootWheel1.set(0);
		}
	}
	                                                                                                                                                          
	public void hoodUp(){
		hoodUP.set(Relay.Value.kOn);
	}
	
	public void hoodDown(){
		hoodDW.set(Relay.Value.kOff);
	}
		
}