package domain;

public class Missile extends GameObject{
	
	boolean isFromEnemy = false;

	public Missile (int x, int y, boolean isFromEnemy) {
		// Default Constructor for Missile class
		super(x, y);
		this.isFromEnemy = isFromEnemy;
	}
	
	
	@Override
	public void move(int x, int y) {
		if (isFromEnemy) { // If missile comes from an enemy, it will descend across the screen
			this.positionY--;
		}
		else {
			this.positionY++; // If we have shot it, it should ascend across the screen
		}
	}
	
	public int getMissilePositionX() {
		return this.positionX;
	}
	
	public int getMissilePositionY() {
		return this.positionY;
	}
	
}
