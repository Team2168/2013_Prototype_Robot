package org.team2168.utils;

/**
 * This class determines the coordinate position of 
 * 
 * @author James
 *
 */
public class Location {

	private double previousDistance;
	
	public Location() {
		previousDistance = 0;
	}
	
	public void update(double leftDistance, double rightDistance,
			double angle) {
		
	}
	
	public void update(double distance, double angle) {
		this.update(distance, distance, angle);
	}
	
	public void reset() {
		
	}

}
