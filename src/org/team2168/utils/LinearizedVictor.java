package org.team2168.utils;

import edu.wpi.first.wpilibj.Victor;

/**
 * This class acts as a wrapper for the Victor class such that
 * commands sent to the motor controller are adjusted to yield
 * a linearized output.  
 *
 * @author James
 *
 */
public class LinearizedVictor extends Victor {

	public LinearizedVictor(int channel) {
		super(channel);
	}

	public LinearizedVictor(int slot, int channel) {
		super(slot, channel);
	}
	
    /**
     * This method acts as a middle man between the input and the
     * Victor class' set method. Adapted from team 254's C code. Thanks!
     * 
     * @param speed the desired % of output voltage from the victor
     * @return the linearized speed
     */
	public void set(double speed) {
		double deadband_value = 0.082;
    	if (speed > deadband_value) {
    		speed -= deadband_value;
    	} else if (speed < -deadband_value) {
    		speed += deadband_value;
    	} else {
    		speed = 0.0;
    	}
    	speed = speed / (1.0 - deadband_value);

    	double goal_speed2 = speed * speed;
    	double goal_speed3 = goal_speed2 * speed;
    	double goal_speed4 = goal_speed3 * speed;
    	double goal_speed5 = goal_speed4 * speed;
    	double goal_speed6 = goal_speed5 * speed;
    	double goal_speed7 = goal_speed6 * speed;

    	// Constants for the 5th order polynomial
    	double victor_fit_e1	= 0.437239;
    	double victor_fit_c1	= -1.56847;
    	double victor_fit_a1	= (- (125.0 * victor_fit_e1
    			+ 125.0 * victor_fit_c1 - 116.0) / 125.0);
    	double answer_5th_order = (victor_fit_a1 * goal_speed5
    			+ victor_fit_c1 * goal_speed3
    			+ victor_fit_e1 * speed);

    	// Constants for the 7th order polynomial
    	double victor_fit_c2 = -5.46889;
    	double victor_fit_e2 = 2.24214;
    	double victor_fit_g2 = -0.042375;
    	double victor_fit_a2 = (- (125.0 * (victor_fit_c2 + victor_fit_e2
    			+ victor_fit_g2) - 116.0) / 125.0);
    	double answer_7th_order = (victor_fit_a2 * goal_speed7
    			+ victor_fit_c2 * goal_speed5
    			+ victor_fit_e2 * goal_speed3
    			+ victor_fit_g2 * speed);


    	// Average the 5th and 7th order polynomials
    	double answer =  0.85 * 0.5 * (answer_7th_order + answer_5th_order)
    			+ .15 * speed * (1.0 - deadband_value);

    	if (answer > 0.001)
    		answer += deadband_value;
    	else if (answer < -0.001)
    		answer -= deadband_value;

    	super.set(answer);
	}
}
