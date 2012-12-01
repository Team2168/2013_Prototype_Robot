package org.usfirst.frc2168;

import edu.wpi.first.wpilibj.DriverStationLCD;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
///////////////////////////SYSTEM CONSTANTS////////////////////////////

//JOYSTICK MAPS	
public static final int driverJoystick=1; //USB Port 1
public static final int auxJoystick=2; //USB Port 2

/////////////////////////////CRIO MAP//////////////////////////////
///////////////////////Analog Card - Slot 1////////////////////////
//Analog IO 1-8
public static final int ballDetectorUpper = 1; //AIO 1, Analog Card
public static final int ballLight = 2; //AIO 2, Analog Card
public static final int ballDetectorLower = 3; //AIO 1, Analog Card

///////////////////////Digital Card - Slot 2///////////////////////
//Digital IO 1-14
public static final int leftDriveTrainEncoder_A=1;		//DIO 1, Digital Card
public static final int leftDriveTrainEncoder_B=2;		//DIO 2, Digital Card
public static final int rightDriveTrainEncoder_A=3;		//DIO 3, Digital Card
public static final int rightDriveTrainEncoder_B=4;		//DIO 4, Digital Card
public static final int shooterWheelEncoderID_A = 5;	//DIO 5, Digital Card
public static final int shooterWheelEncoderID_B = 6;	//DIO 6, Digital Card
public static final int compressorSwitch = 7;			//DIO 7, Digital Card
public static final int autoSwitch = 8;					//DIO 8, Digital Card

//PWM 1-10
public static final int lift1Victor = 1;		//PWM 1, Digital Card
public static final int lift2Victor = 2;		//PWM 2, Digital Card
public static final int driveLeft1JagPWM = 3;	//PWM 3, Digital Card
public static final int driveLeft2JagPWM = 4;	//PWM 4, Digital Card
public static final int driveRight1JagPWM = 5;	//PWM 5, Digital Card
public static final int driveRight2JagPWM = 6;	//PWM 6, Digital Card
public static final int shooter1JagPWM = 7;		//PWM 7, Digital Card
public static final int shooter2JagPWM = 8;		//PWM 8, Digital Card

//Relay 1-8
public static final int compressorRelay = 1;	//Relay Port 1, Digital Card
public static final int PegLegRelay = 2;		//Relay Port 2, Digital Card
public static final int backLight = 3;			//Relay Port 3, Digital Card


///////////////////////Solenoid Card - Slot 3///////////////////////
//Solenoid 1-8
public static final int hoodSolenoidPortFwd = 1; 				//Port 1, Solenoid Card
public static final int hoodSolenoidPortReverse = 2;			//Port 2, Solenoid Card
public static final int backFlapSolenoidClose = 3;				//Port 3, Solenoid Card
public static final int backFlapSolenoidOpen = 4;				//Port 4, Solenoid Card
public static final int shiftForwardChannel = 5;				//Port 5, Solenoid Card
public static final int shiftReverseChannel = 6;				//Port 6 , Solenoid Card
public static final int bridgeArmSolenoidReverseChannel = 7;	//Port 7, Solenoid Card
public static final int bridgeArmSolenoidForwardChannel = 8;	//Port 8, Solenoid Card

///////////////////////Solenoid Card - Slot 3///////////////////////
//Analog 1-8
public static final int voltageRefPSOC = 1; //Voltage reference, VCC
public static final int shooterWheelFinePSOC = 2; //Manual Shooter Speed, fine control (top slide pot)
public static final int shooterWheelCoursePSOC = 3; //Manual Shooter Speed, coarse control (bottom slide pot)
//public static final int  Analog4;
//public static final int Analog5;
//public static final int Analog6;
public static final int rightDelayPot = 7; //Right Delay Potentiometer
public static final int leftDelayPot = 8; //Left Delay Potentiometer

///////////////////////////SUBSYSTEM CONSTANTS///////////////////////////////
///////////////////////////////DRIVETRAIN////////////////////////////////////	
/*
The drivetrain uses four CAN motors. The image below represents a top view of the Chassis
so that the location of each motor can be identified. This image is to be used as a key
to determine the values of the CAN motor ids.
 	____________ 
	|			|
	|    FWD    |
	|           |
  L1|           |R1
	|           |
  L2|           |R2
	|           |
	|    AFT    |
	|___________| 
*/

//Creating Static CAN IDs for DriveTrain Motors
public static final int leftmotor1 = 13, rightmotor1 = 2;
public static final int leftmotor2 = 17, rightmotor2 = 10;

//Motor Invert Direction 
public static final boolean invertRight = false;	//if true invert signal to right motors
public static final boolean invertLeft = true;		//if true invert signal to left motors

//Falcon Claw Brake Modifier
public static final double mod = 0.125;	// Low minimum/modifier for the "Falcon Claw Function" or James' "Super Secret" Idea

//Wheel Radius
public static final int driveWheelRadius=2;//Colson wheel radius in inches

//DriveTraincEncoder Parameters
public static final int driveEncoderPulsePerRot=250;
public static final double driveEencoderDistPerTick=(Math.PI*2*driveWheelRadius)/driveEncoderPulsePerRot;
public static final boolean leftDriveTrainEncoderReverse=false;
public static final boolean rightDriveTrainEncoderReverse=false;

////////////////////////////HOOD////////////////////////////////////////
//Creating Static CAN IDs for Shooter Motors
public static final int shooterWheelCANID = 11, shooterWheel2CANID = 12; 

//Constant value for shooter wheel
public static final double HIGH_GOAL_KEY = 850.0;
public static final double MIDDLE_GOAL_KEY = 700;		//robot should be placed with 2nd drivetrain from back on key line 

public static final double MIDDLE_GOAL_SIDE = 520.0; //hood down   550
public static final double HIGH_GOAL_SIDE = 720.0; //hood down     730

public static final double LOW_GOAL_FORWARD = 430.0;
public static final double MIDDLE_GOAL_FORWARD = 500.0; //hood up
public static final double HIGH_GOAL_FORWARD = 720.0; //hood down


//Hood Wheel Radius in inches
public static final int shooterWheelRadius=3;

//HoodEncoder Parameters
public static final int shooterEncoderPulsePerRot=250;
public static final double shooterEncoderDistPerTick=(Math.PI*2*shooterWheelRadius)/shooterEncoderPulsePerRot;
public static final boolean shooterEncoderReverse=true;

///////////////////////////////Elevator////////////////////////////////////
//ball detected
public static final double ballPresentVoltage = 1.6;

//Constant to drive elevator
public static final double liftVoltage = -0.50;

////////////////////////////////////////////////////////////////////////////
}
