package domain;

import application.GameController;

public class Player extends GameObject {
	public Player(int x, int y) {
		super(x, y);
		
	}
	
	@Override
	public void attack(GameObject player) {
			// Missile will be created on same X but Y+1 position, to avoid it to collide with its creator
			// No attacking condition needed: Only when user press the right button
			Missile missile = new Missile(this.positionX, this.positionY+1, false);
			GameController.addGameObject(missile); // new Missile()
	}
	
	@Override
	public void move(int x, int y) {
		// This void will move Player's spaceship from the Main package
	}
	
}
