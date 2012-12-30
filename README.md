#FatSwanRedux
2013 Pre-season exercise, writing the command based robot code for the 2012 robot - Fat Swan.
This robot code is written in Java using the Command Based robot project template.

## Functionality
Fat Swan has the following major subsystems. For more information on this robot, visit http://team2168.org/index.php/about-us/robots

#### Drivetrain
Fat swan has an eight wheel drivetrain driven by a total of four CIM motors. It is equipped with two pneumatically operated dual speed transmissions.

#### Shooter
The shooter is composed of two 6" colson wheels driven by two Fisher Price motors. An encoder monitors the shooter speed to maintain operator selectable presets (for scoring from different distances). The shooter subsystem also contains a two position hood to control the trajectory of the fired balls.

#### Lift
The lift subsystem is responsible for moving balls from the floor up to the shooter. Balls are moved vertically by polycord belts. A pneumatic "back flap" provides hopper functionality. When the back flap is opened balls cannot be driven into the shooter. When it is closed, balls are forced to stack vertically. A sensor at the top of the lift assembly dectects the presence of balls. Allowing a single ball to be fired at a time.

#### Bridge Knockdown
A single pneumatic cylinder attached to an arm with a wheel on the end, when actuated it will lower the bridge.

#### Peg Leg
This mechanism was a late addition to the robot. It is a pnuematic cylinder which extends to aid in balancing robots on the bridge.

## Implemented in master branch
These are the major funtions which have been brought into the master branch.
#### Subsystems
* Shooter
* Knockdown
* Pegleg
* Drivetrain

## Todo:
* Complete all subsystem code
* Complete command groups
* Map commands to joysticks
* Deploy code to robot
