package domain;

import java.util.Random;

public class Meteor extends GameObject{
	
	private static final int MIN_ANGLE = 1; // Minimum angle from X axis should be at least 1º (0º wouldn't have any effect)
	private static final int MAX_ANGLE = 179; // Maximum angle must be less than 180 (180º wouldn't have any effect)
	private static final int MIN_VELOCITY = 1;
	private static final int MAX_VELOCITY = 100;
	private Random randomNumber;
	
	double angle, velocity;
	
	public Meteor(int x, int y) {
		// Default constructor for Meteor
		super(x, y);
		// In degrees, don't forget to use it as radians
		angle = MIN_ANGLE + (MAX_ANGLE - MIN_ANGLE) * randomNumber.nextDouble();
		// Velocity variable includes an increment of time
		velocity =	MIN_VELOCITY + (MAX_VELOCITY - MIN_VELOCITY) * randomNumber.nextDouble();
	}
	
	public int getMeteorPositionX() {
		return this.positionX;
	}
	
	public int getMeteorPositionY() {
		return this.positionY;
	}
	
	
	@Override
	public void move(int x, int y) {
		calculateNewPosition (x, y);
		// positionY always decreases
		this.positionY -= y;
		if (angle <= 90) { // X position increases if angle is between 0 and 90, and decreases if angle is between 90 and 180
			// positionX increases (Be careful: position must be an integer and velocity or angle are doubles)
			this.positionX += x;
		} else {
			this.positionX -= x;
		}
	}
	
	private void calculateNewPosition (int x, int y) {
		// This code should use velocity and angle to calculate x and y.
	}

}
