package domain;

import application.GameController;

public class Enemy extends GameObject {
	
	public Enemy(int x, int y) {
		super(x, y);
		
	}
	
	@Override
	public void attack(GameObject player) {
		if (player.positionX == this.positionX && player.positionY < this.positionY) {
			// Missile will be created on same X but Y-1 position, to avoid it to collide with its creator
			Missile missile = new Missile(this.positionX, this.positionY-1, true);
			GameController.addGameObject(missile); // new Missile()
		}
	}
	
	@Override
	public void move(int x, int y) {
		// This void will move the Enemy object in the way it's supposed to move.
	}

}
