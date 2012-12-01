package org.team2168;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	// Driver Joystick
	public Joystick drivestick = new Joystick(RobotMap.driverJoystick);
	public Button driveButtonA = new JoystickButton(drivestick, 1),
			driveButtonB = new JoystickButton(drivestick, 2),
			driveButtonX = new JoystickButton(drivestick, 3),
			driveButtonY = new JoystickButton(drivestick, 4),
			driveButtonLeftBumper = new JoystickButton(drivestick, 5),
			driveButtonRightBumper = new JoystickButton(drivestick, 6),
			driveButtonReset = new JoystickButton(drivestick, 7),
			driveButtonStart = new JoystickButton(drivestick, 8);
	public JoystickAnalogButton driveTriggerR = new JoystickAnalogButton(
			drivestick, 3, -0.5), driveTriggerL = new JoystickAnalogButton(
			drivestick, 3, 0.5), driveDPadL = new JoystickAnalogButton(
			drivestick, 6, -0.5), driveDPadR = new JoystickAnalogButton(
			drivestick, 6, 0.5);

	// Auxiliary Joystick
	public Joystick auxstick = new Joystick(RobotMap.auxJoystick);
	public Button auxButtonA = new JoystickButton(auxstick, 1),
			auxButtonB = new JoystickButton(auxstick, 2),
			auxButtonX = new JoystickButton(auxstick, 3),
			auxButtonY = new JoystickButton(auxstick, 4),
			auxButtonLeftBumper = new JoystickButton(auxstick, 5),
			auxButtonRightBumper = new JoystickButton(auxstick, 6),
			auxButtonReset = new JoystickButton(auxstick, 7),
			auxButtonStart = new JoystickButton(auxstick, 8);

	public JoystickAnalogButton auxTriggerR = new JoystickAnalogButton(
			auxstick, 3, -0.5), auxTriggerL = new JoystickAnalogButton(
			auxstick, 3, 0.5), auxDPadL = new JoystickAnalogButton(auxstick, 6,
			-0.5), auxDPadR = new JoystickAnalogButton(auxstick, 6, 0.5);

	public OI() {
		//Map commands to Joystick buttons
//		 driveButtonRightBumper.whenPressed(new ShiftGearsLowToHigh());
//		 driveButtonLeftBumper.whenPressed(new ShiftGearsHighToLow());
//		 driveButtonStart.whenPressed(new LowerBridge());
//		 driveButtonStart.whenReleased(new RaiseBridge());
//		 driveButtonReset.whenPressed(new PegLegDown());
//		 driveButtonReset.whenReleased(new PegLegUp());
//		
//		
//		 auxButtonA.whenPressed(new key2_3());
//		 auxButtonB.whenPressed(new side2_3());
//		 auxButtonY.whenPressed(new fender2_3());
//		 auxButtonX.whenPressed(new PID_ShooterPause());
//		
//		 auxButtonStart.whenPressed(new shootSingleBall());
//		
//		 auxButtonRightBumper.whenPressed(new BackFlapClose());
//		 auxButtonLeftBumper.whenPressed(new BackFlapOpen());
	}
}
